@Entity
@Table(name = "bookings")
public class Booking {
    @Id @GeneratedValue
    private Long id;

    @ManyToOne
    private User user;

    @ManyToOne
    private EventSpace space;

    private LocalDateTime startTime;
    private LocalDateTime endTime;

    private String status; // PENDING, APPROVED, REJECTED

    // getters and setters
}
