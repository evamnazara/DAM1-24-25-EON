package ASIGNATURAS.CONTORNOS.ud4;

public class OverlyEngineeredHelloWorld {
    public static void main(String[] args) {
        Message message = new HelloWorldMessage();
        System.out.println(message.getContent());
    }
}

interface Message {
    String getContent();
}

class HelloWorldMessage implements Message {
    @Override
    public String getContent() {
        return "Hello World!";
    }
}
