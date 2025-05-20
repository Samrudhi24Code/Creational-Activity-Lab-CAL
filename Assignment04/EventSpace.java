@Entity
@Table(name = "event_spaces")
public class EventSpace {
    @Id @GeneratedValue
    private Long id;

    private String name;
    private String location;
    private int capacity;
    private double pricePerHour;

    // getters and setters
}
