package drawing;

import drawing.shapes.Shape;
import drawing.writing.WriterFactory;

import java.io.IOException;
import java.io.Writer;
import java.util.List;

public class Drawing {
    private final List<Shape> shapes;

    public Drawing(List<Shape> shapes) {
        this.shapes = shapes;
    }

    public void draw(String format, String filename) {
        try (Writer writer = WriterFactory.createWriter(format, filename)) {
            for (Shape shape : shapes) {
                shape.draw(writer, shape.toLines());
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

