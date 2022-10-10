
package Serializacion;

import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.OutputStream;

public class MiObjectOutputStream extends ObjectOutputStream{
    
    protected void writeStreamHeader(){
        
    }
    
    public MiObjectOutputStream() throws IOException{
        super();
    }
    
    public MiObjectOutputStream(OutputStream out) throws IOException{
        super(out);
    }
    
}
