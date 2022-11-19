namespace Solution_1
{
    public class Error_Code
    {
        enum Code { BadRequest = 0, Unauthorized = 1, Forbidden = 3, NotFound = 4, RequestTimeout = 8};

        public void Code_Meaning(int code)
        {
            Console.WriteLine((Code)code);
        }
    }
    internal class Solution_1
    {
        static void Main(string[] args)
        {
            string code = Console.ReadLine();

            int codenumber = code[code.Length - 1] - '0';

            Error_Code error = new Error_Code();
            error.Code_Meaning(codenumber);
        }
    }
}

/*namespace Solution_2
{
    public class Direction
    {
        private string position;
        public string get_position()
        { return this.position; }

        public void Current_Direction(string position)
        {
            this.position = position.ToUpper();
        }

        public void Direction_ToGo(string position)
        {
            if (position == "NORTH")
            {
                Console.WriteLine("Go South");
            }
            else if (position == "SOUTH")
            {
                Console.WriteLine("Go North");
            }
            else if (position == "EAST")
            {
                Console.WriteLine("Go West");
            }
            else if (position == "WEST")
            {
                Console.WriteLine("Go East");
            }
            else Console.WriteLine("Not a proper position");
        }
    }
    internal class Solution_2
    {
        static void Main(string[] args)
        {
            string position;
            position = Console.ReadLine();
            Direction direction = new Direction();

            direction.Current_Direction(position);
            direction.Direction_ToGo(direction.get_position());
        }
    }
}*/

/*namespace Solution_3
{
    public class Format_Exception : Exception
    {
        public  Format_Exception(string message) : base(message) { }
    }
    public class Person
    {
        private string mobile_number;

        public string Get_MobileNumber()
        { return mobile_number; }

        public void Set_MobileNumber(string number)
        { this.mobile_number = number; }

        public bool Verify_Number(string number)
        {
            bool numbercheck = false;
            bool underscore = false;
            int buffer = 0;
            for(int i=0; i<number.Length; i++)
            {
                if(number[i] >= '0' && number[i] <= '9')
                {
                    buffer++;
                }
                else if(number[i] == '_')
                {
                    underscore = true;
                }
            }
            if(buffer == 8)
            {
                numbercheck = true;
            }
            if (underscore == true && numbercheck == true)
                return true;
            else return false;
        }

    }
    internal class Solution_3
    {
        static void Main(string[] args)
        {
            string mobile;
            mobile = Console.ReadLine();

            Person person = new Person();
            person.Set_MobileNumber(mobile);

            try
            {
                if (person.Verify_Number(mobile) == false)
                    throw new Format_Exception("Not Ok");
                else Console.WriteLine("Ok");
            }
            catch (Format_Exception ex)
            {
                Console.WriteLine(ex.Message);
            }
        }
    }
}*/
