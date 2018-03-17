using System;
using System.Collections.Generic;

namespace lR3
{
    class Program
    {
        static void Main(string[] args)
        {
            int[] array = new int[] { 1, 1, 1, 1, 2, 3, 5, 5, 5 };
            Sorter s = new Sorter();

            List<int> result = s.Sort(array);
            s.output(result);

            Console.ReadKey();
            }
            
        }
    }

