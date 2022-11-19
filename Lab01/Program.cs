/*namespace SWE4302_Lab01
{
    internal abstract class Booking
    {
        abstract public void Ticket_Booking();
    }
    internal class Air_Booking : Booking
    {
        public override void Ticket_Booking()
        {
            Console.WriteLine("Air ticket has been booked");
        }
    }
    internal class Bus_Booking : Booking
    {
        public override void Ticket_Booking()
        {
            Console.WriteLine("Bus ticket has been booked");
        }
    }
    internal class Agent
    {
        public void Book_Bus()
        {
            Bus_Booking bus_booking = new Bus_Booking();
            bus_booking.Ticket_Booking();
        }
        public void Book_Air()
        {
            Air_Booking air_booking = new Air_Booking();
            air_booking.Ticket_Booking();
        }
    }

    class Program
    {
        static void Main(string[] args)
        {
            Console.WriteLine("Please select a number for booking your ticket: \nSelect 1 to book an Air ticket \nSelect 2 to book a Bus Ticket");
            int ticket_type = Convert.ToInt32(Console.ReadLine());
            if (ticket_type == 1)
            {
                Agent agent = new Agent();
                agent.Book_Air();
            }
            else if (ticket_type == 2)
            {
                Agent agent = new Agent();
                agent.Book_Bus();
            }
            else Console.WriteLine("Please select a correct number");
        }
    }
}*/

namespace SWE4202_Lab01
{
    public class Average
    {
       public int[] number;
    }
    class Program
    {
        static void Main(string[] args)
        {
            Average a = new Average();
        }
    }
}