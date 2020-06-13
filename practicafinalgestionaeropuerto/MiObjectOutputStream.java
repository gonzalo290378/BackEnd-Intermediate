package practicafinalgestionaeropuerto;

import java.io.*;

//ESTA CLASE QUE HEREDA DE OBJECTOUTPUTSTREM Y LO QUE HACE ES NO ESCRIBIR NADA EN LA CABECERA.

public class MiObjectOutputStream extends ObjectOutputStream {

    /**
     * Constructor que recibe OutputStream
     *
     * @param out OutputStream
     * @throws java.io.IOException IOException
     */
    public MiObjectOutputStream(OutputStream out) throws IOException {
        super(out); //Llama al constructor de la superclase(OutputStream)
    }

    /**
     * Constructor sin parámetros
     *
     * @throws java.io.IOException IOException
     */
    protected MiObjectOutputStream() throws IOException, SecurityException {
        super(); //Llama al constructor de la superclase(OutputStream)
    }

    @Override
    protected void writeStreamHeader() throws IOException {
        //No hacemos nada
    }
}
