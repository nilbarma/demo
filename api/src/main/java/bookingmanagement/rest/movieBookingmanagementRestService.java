package service.api.rest;

import javax.validation.Valid;
import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import org.springframework.data.domain.Page;

import com.devonfw.application.mtsj.bookingmanagement.common.api.to.BookingCto;
import com.devonfw.application.mtsj.bookingmanagement.common.api.to.BookingEto;
import com.devonfw.application.mtsj.bookingmanagement.common.api.to.BookingSearchCriteriaTo;
import com.devonfw.application.mtsj.bookingmanagement.common.api.to.TableEto;
import com.devonfw.application.mtsj.bookingmanagement.common.api.to.TableSearchCriteriaTo;

@Path("/bookingmanagement/v1")
@Consumes(MediaType.APPLICATION_JSON)
@Produces(MediaType.APPLICATION_JSON)
public interface movieBookingmanagementRestService {

  @GET
  @Path("/booking/{id}/")
  public BookingCto getBooking(@PathParam("id") long id);

  @POST
  @Path("/booking/")
  public BookingEto saveBooking(@Valid BookingCto booking);

  @DELETE
  @Path("/booking/{id}/")
  public void deleteBooking(@PathParam("id") long id);

  @Path("/booking/search")
  @POST
  public Page<BookingCto> findBookingsByPost(BookingSearchCriteriaTo searchCriteriaTo);

  @Path("/booking/cancel/{token}")
  @GET
  public void cancelInvite(@PathParam("token") String bookingToken);

  @GET
  @Path("/seat/{id}/")
  public SeatEto getSeat(@PathParam("id") long id);

  @POST
  @Path("/seat/")
  public SeatEto saveSeat(SeatEto seat);

  @DELETE
  @Path("/seat/{id}/")
  public void deleteSeat(@PathParam("id") long id);

  @Path("/seat/search")
  @POST
  public Page<SeatEto> findSeatByPost(SeatSearchCriteriaTo searchCriteriaTo);
}
