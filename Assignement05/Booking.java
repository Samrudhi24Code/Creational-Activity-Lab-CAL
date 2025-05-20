@Entity
public class Booking {
    @Id @GeneratedValue
    private Long id;

    @ManyToOne
    private User user;

    @ManyToOne
    private EventSpace eventSpace;

    private LocalDateTime startTime;
    private LocalDateTime endTime;
    private String status; // PENDING / APPROVED / REJECTED
}
