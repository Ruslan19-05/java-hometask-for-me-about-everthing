package az.edu.turing.reflectionPractic;

import java.io.*;

public class AppendOutputStream extends ObjectOutputStream {

    public AppendOutputStream(OutputStream out) throws IOException {
        super(out);
    }

    @Override
    protected void writeStreamHeader() throws IOException {
        reset();
    }

}
