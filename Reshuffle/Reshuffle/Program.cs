using System;

namespace Reshuffle
{
    class Program
    {
        private static int modulus;

        static void Main(string[] args)
        {
            int [] array = new int[] {4,5,6,7,-12,-3,4,-5,-7,2 };
            int min = array[0];
            int minIndex = 0;
            int max = array[0];
            int maxIndex = 0;
            for (int i = 0; i < array.Length; i++)
            {
                if (array[i] > 0 && array[i] < min)
                {
                        min = array[i];
                        minIndex = i;
                }

            }
            for (int j = 0; j < array.Length; j++)
            {
                modulus = Math.Abs(array[j]);
                if (array[j] < 0 && max < modulus)
                {
                    max = modulus;
                    maxIndex = j;
                }
            }

            int address = array[minIndex];
            array[minIndex] = array[maxIndex];
            array[maxIndex] = address;
         

            for (int i = 0; i < array.Length; i++)
            {
                Console.Write(array[i] + " ");
            }
        
            Console.ReadKey();
        }
    }
}
