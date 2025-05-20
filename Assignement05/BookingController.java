@RestController
@RequestMapping("/api/bookings")
public class BookingController {

    @Autowired private BookingService bookingService;

    @PostMapping
    public ResponseEntity<Booking> createBooking(@RequestBody Booking booking) {
        return ResponseEntity.ok(bookingService.bookEvent(booking));
    }

    @GetMapping("/user/{id}")
    public ResponseEntity<List<Booking>> getUserBookings(@PathVariable Long id) {
        return ResponseEntity.ok(bookingService.getBookingsByUser(id));
    }
}
