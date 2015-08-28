package fr.inria.diverse.melange.ui.hyperlink

import fr.inria.diverse.melange.metamodel.melange.Import
import fr.inria.diverse.melange.metamodel.melange.Language
import fr.inria.diverse.melange.metamodel.melange.MelangePackage
import java.util.List
import org.eclipse.emf.common.util.URI
import org.eclipse.jface.text.Region
import org.eclipse.xtext.nodemodel.INode
import org.eclipse.xtext.nodemodel.util.NodeModelUtils
import org.eclipse.xtext.resource.XtextResource
import org.eclipse.xtext.ui.editor.hyperlinking.IHyperlinkAcceptor
import org.eclipse.xtext.util.ITextRegion
import org.eclipse.xtext.xbase.ui.navigation.XbaseHyperLinkHelper

class MelangeHyperlinkHelper extends XbaseHyperLinkHelper{
    
    override createHyperlinksByOffset(XtextResource resource, int offset, IHyperlinkAcceptor acceptor) {
        
        val element = getEObjectAtOffsetHelper.resolveElementAt(resource, offset)
        
        if (element instanceof Import) {            
            
            val uriConverter = resource.resourceSet.URIConverter
            val uri = URI.createURI(element.ecoreUri)
            val region = getTextRegion(element.eContainer as Language, offset)
            
            val hyperlink = hyperlinkProvider.get() => [
                hyperlinkRegion = new Region(region.offset+7, region.length-7)
                URI = if (uri.isPlatformResource) uri else uriConverter.normalize(uri)
                hyperlinkText = ("Open "+ (element.eContainer as Language).name +" Ecore file")
            ]
            
            acceptor.accept(hyperlink)
        }
        else {
            super.createHyperlinksByOffset(resource, offset, acceptor)
        }
    }
    
    
    def ITextRegion getTextRegion(Language lang,  int offset) {
        val List<INode> nodes = NodeModelUtils.findNodesForFeature(lang,
                MelangePackage.Literals.LANGUAGE__OPERATORS);
        for (INode node : nodes) {
            val ITextRegion textRegion = node.getTextRegion();
            if (textRegion.contains(offset)) {
                return textRegion;
            }
        }
        return null;
    }
}