package fr.inria.diverse.iot2.iot2.aspects;

import fr.inria.diverse.k3.al.annotationprocessor.Aspect;
import fr.inria.diverse.k3.al.annotationprocessor.OverrideAspectMethod;
import java.util.function.Consumer;
import org.eclipse.emf.common.util.EList;
import fr.inria.diverse.iot2.iot2.iot2.Block;
import fr.inria.diverse.iot2.iot2.iot2.LastStatement;
import fr.inria.diverse.iot2.iot2.iot2.Statement;
import fr.inria.diverse.iot2.iot2.aspects.BlockAspectBlockAspectProperties;
import fr.inria.diverse.iot2.iot2.aspects.ChunkAspect;
import fr.inria.diverse.iot2.iot2.aspects.Environment;
import fr.inria.diverse.iot2.iot2.aspects.LastStatementAspect;
import fr.inria.diverse.iot2.iot2.aspects.StatementAspect;

@Aspect(className = Block.class)
@SuppressWarnings("all")
public class BlockAspect extends ChunkAspect {
  @OverrideAspectMethod
  public static void execute(final Block _self, final Environment c) {
    fr.inria.diverse.iot2.iot2.aspects.BlockAspectBlockAspectProperties _self_ = fr.inria.diverse.iot2.iot2.aspects.BlockAspectBlockAspectContext.getSelf(_self);
     if (_self instanceof fr.inria.diverse.iot2.iot2.iot2.Block){
     fr.inria.diverse.iot2.iot2.aspects.BlockAspect._privk3_execute(_self_, (fr.inria.diverse.iot2.iot2.iot2.Block)_self,c);
    } else  if (_self instanceof fr.inria.diverse.iot2.iot2.iot2.Chunk){
     fr.inria.diverse.iot2.iot2.aspects.ChunkAspect.execute((fr.inria.diverse.iot2.iot2.iot2.Chunk)_self,c);
    } else  { throw new IllegalArgumentException("Unhandled parameter types: " + java.util.Arrays.<Object>asList(_self).toString()); };
  }
  
  private static void super_execute(final Block _self, final Environment c) {
    fr.inria.diverse.iot2.iot2.aspects.ChunkAspectChunkAspectProperties _self_ = fr.inria.diverse.iot2.iot2.aspects.ChunkAspectChunkAspectContext.getSelf(_self);
     fr.inria.diverse.iot2.iot2.aspects.ChunkAspect._privk3_execute(_self_, _self,c);
  }
  
  protected static void _privk3_execute(final BlockAspectBlockAspectProperties _self_, final Block _self, final Environment c) {
    EList<Statement> _statements = _self.getStatements();
    final Consumer<Statement> _function = (Statement s) -> {
      StatementAspect.execute(s, c);
    };
    _statements.forEach(_function);
    LastStatement _returnValue = _self.getReturnValue();
    if (_returnValue!=null) {
      LastStatementAspect.execute(_returnValue, c);
    }
  }
}
