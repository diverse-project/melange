package fr.inria.diverse.iot2.iot2.aspects;

import java.util.Map;
import fr.inria.diverse.iot2.iot2.iot2.Chunk;
import fr.inria.diverse.iot2.iot2.aspects.ChunkAspectChunkAspectProperties;

@SuppressWarnings("all")
public class ChunkAspectChunkAspectContext {
  public final static ChunkAspectChunkAspectContext INSTANCE = new ChunkAspectChunkAspectContext();
  
  public static ChunkAspectChunkAspectProperties getSelf(final Chunk _self) {
    		if (!INSTANCE.map.containsKey(_self))
    			INSTANCE.map.put(_self, new fr.inria.diverse.iot2.iot2.aspects.ChunkAspectChunkAspectProperties());
    		return INSTANCE.map.get(_self);
  }
  
  private Map<Chunk, ChunkAspectChunkAspectProperties> map = new java.util.WeakHashMap<fr.inria.diverse.iot2.iot2.iot2.Chunk, fr.inria.diverse.iot2.iot2.aspects.ChunkAspectChunkAspectProperties>();
  
  public Map<Chunk, ChunkAspectChunkAspectProperties> getMap() {
    return map;
  }
}
