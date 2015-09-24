package fr.inria.diverse.iot2.iot2.aspects;

import fr.inria.diverse.k3.al.annotationprocessor.Aspect;
import fr.inria.diverse.iot2.iot2.iot2.Chunk;
import fr.inria.diverse.iot2.iot2.aspects.ChunkAspectChunkAspectProperties;
import fr.inria.diverse.iot2.iot2.aspects.Environment;

@Aspect(className = Chunk.class)
@SuppressWarnings("all")
public class ChunkAspect {
  public static void execute(final Chunk _self, final Environment c) {
    fr.inria.diverse.iot2.iot2.aspects.ChunkAspectChunkAspectProperties _self_ = fr.inria.diverse.iot2.iot2.aspects.ChunkAspectChunkAspectContext.getSelf(_self);
     if (_self instanceof fr.inria.diverse.iot2.iot2.iot2.Block){
     fr.inria.diverse.iot2.iot2.aspects.BlockAspect.execute((fr.inria.diverse.iot2.iot2.iot2.Block)_self,c);
    } else  if (_self instanceof fr.inria.diverse.iot2.iot2.iot2.Chunk){
     fr.inria.diverse.iot2.iot2.aspects.ChunkAspect._privk3_execute(_self_, (fr.inria.diverse.iot2.iot2.iot2.Chunk)_self,c);
    } else  { throw new IllegalArgumentException("Unhandled parameter types: " + java.util.Arrays.<Object>asList(_self).toString()); };
  }
  
  protected static void _privk3_execute(final ChunkAspectChunkAspectProperties _self_, final Chunk _self, final Environment c) {
  }
}
