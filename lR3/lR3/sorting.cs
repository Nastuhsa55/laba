using System;
using System.Collections.Generic;

namespace lR3
{
    class Sorter
    {
        public List<int> Sort(int[] array)
        {
           
            List<int> result = new List<int>();
            int number = array[0];
            int count = 1;
            for (int i = 1; i < array.Length; i++)
            {
                if (number == array[i])
                {
                    count++;
                }
                else
                {
                    result.Add(count);
                    number = array[i];
                    count = 1;
               
                }
            }
            
            result.Add(count);
            return result;
        }


        public void output(List <int> result )
        {
            for (int i = 0; i < result.Count; i++)
            {
                Console.Write( $"{result[i]} ");
            }
            
        }
    }
}
