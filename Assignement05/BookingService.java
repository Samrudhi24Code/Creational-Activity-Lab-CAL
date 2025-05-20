@Service
public class BookingService {
    @Autowired BookingRepository bookingRepo;

    public Booking bookEvent(Booking booking) {
        booking.setStatus("PENDING");
        return bookingRepo.save(booking);
    }

    public List<Booking> getBookingsByUser(Long userId) {
        return bookingRepo.findByUserId(userId);
    }
}
