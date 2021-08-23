package demo.ooad;

/**
 * Stateful
 * Immutable
 * POJO
 */
public class Message {
    private final String body; //state

    /**
     * Public API
     */
    public Message(String body) {
        this.body = body;
    }

    /**
     * Up-front design
     * @return
     */
    public String getBody() {
        return body;
    }

    @Override
    public String toString() {
        return "{ " + body  + " }";
    }
}
