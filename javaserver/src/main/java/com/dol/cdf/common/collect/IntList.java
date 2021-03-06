/*
 * This program is free software: you can redistribute it and/or modify it under
 * the terms of the GNU General Public License as published by the Free Software
 * Foundation, either version 3 of the License, or (at your option) any later
 * version.
 * 
 * This program is distributed in the hope that it will be useful, but WITHOUT
 * ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS
 * FOR A PARTICULAR PURPOSE. See the GNU General Public License for more
 * details.
 * 
 * You should have received a copy of the GNU General Public License along with
 * this program. If not, see <http://www.gnu.org/licenses/>.
 */
package com.dol.cdf.common.collect;

import java.util.Arrays;

/**
 * @author Luis Arias
 *
 */
public class IntList
{
    public static int[] parse(String range)
    {
        if (range.contains("-"))
        {
            return getIntegerList(range.split("-"));
        }
        else if (range.contains(","))
        {
            return getIntegerList(range.split(","));
        }

        int[] list = {getInt(range)};
        return list;
    }

    private static int getInt(String number)
    {
        return Integer.parseInt(number);
    }

    private static int[] getIntegerList(String[] numbers)
    {
        int[] list = new int[numbers.length];
        for (int i=0; i<list.length; i++)
            list[i] = getInt(numbers[i]);
        return list;
    }
    
    public static float getFloatValueLimit(int idx, float[] values) {
		float value = values[idx < values.length ? idx: (values.length - 1)];
		return value;
	}
    
    public static int getIntValueLimit(int idx, int[] values) {
    	int value = values[idx < values.length ? idx: (values.length - 1)];
		return value;
	}

	// TODO bsearch range Array fast
	private void bSearchArrayRange() {
		int[] ints = new int[] { 0, 3, 5, 15, 100, 300 };
		int binarySearch = Arrays.binarySearch(ints, 15);

	}
}
