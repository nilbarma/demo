package com.devon.demo.bookingmanagement;

import javax.inject.Inject;
import javax.inject.Named;
import javax.validation.Valid;

import org.springframework.validation.annotation.Validated;

@Named("MovieBookingmanagementRestService")
@Validated
public class MovieBookingmanagementRestServiceImpl implements MovieBookingmanagementRestService {

  @Inject
  private Bookingmanagement bookingmanagement;

  @Override
  public BookingCto getBooking(long id) {

    return this.bookingmanagement.findBooking(id);
  }

  @Override
  public BookingEto saveBooking(@Valid BookingCto booking) {

    return this.bookingmanagement.saveBooking(booking);

  }

  @Override
  public void deleteBooking(long id) {

    this.bookingmanagement.deleteBooking(id);
  }

  @Override
  public Page<BookingCto> findBookingsByPost(BookingSearchCriteriaTo searchCriteriaTo) {

    return this.bookingmanagement.findBookingsByPost(searchCriteriaTo);
  }

  @Override
  public SeatEto getSeat(long id) {

    return this.bookingmanagement.findSeat(id);
  }

  @Override
  public SeatEto saveSeat(SeatEto seat) {

    return this.bookingmanagement.saveSeat(seat);
  }

  @Override
  public void deleteSeat(long id) {

    this.bookingmanagement.deleteSeat(id);
  }

  @Override
  public Page<SeatEto> findSeatsByPost(SeatSearchCriteriaTo searchCriteriaTo) {

    return this.bookingmanagement.findSeatEtos(searchCriteriaTo);
  }
}
