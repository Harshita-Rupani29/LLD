package CarRentalSystem;

import CarRentalSystem.Product.Vechile;
import java.util.Date;

public class Reservation {

  int reservationId;
  User user;
  Vechile Vechile;
  Date bookingDate;
  Date dateBookedFrom;
  Date dateBookedTo;
  Long fromTimeStamp;
  Long toTimeStamp;
  Location pickUpLocation;
  Location dropLocation;
  ReservationType reservationType;
  ReservationStatus reservationStatus;
  Location location;

  public int createReserve(User user, Vechile Vechile) {

    // generate new id
    reservationId = 12232;
    this.user = user;
    this.Vechile = Vechile;
    reservationType = ReservationType.DAILY;
    reservationStatus = ReservationStatus.SCHEDULED;

    return reservationId;
  }

}
