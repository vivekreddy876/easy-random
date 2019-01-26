/**
 * The MIT License
 *
 *   Copyright (c) 2019, Mahmoud Ben Hassine (mahmoud.benhassine@icloud.com)
 *
 *   Permission is hereby granted, free of charge, to any person obtaining a copy
 *   of this software and associated documentation files (the "Software"), to deal
 *   in the Software without restriction, including without limitation the rights
 *   to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 *   copies of the Software, and to permit persons to whom the Software is
 *   furnished to do so, subject to the following conditions:
 *
 *   The above copyright notice and this permission notice shall be included in
 *   all copies or substantial portions of the Software.
 *
 *   THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 *   IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 *   FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 *   AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 *   LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 *   OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN
 *   THE SOFTWARE.
 */
package io.github.benas.randombeans.beans;

import io.github.benas.randombeans.annotation.Randomizer;
import io.github.benas.randombeans.annotation.RandomizerArgument;
import io.github.benas.randombeans.randomizers.range.DateRangeRandomizer;
import io.github.benas.randombeans.randomizers.range.IntegerRangeRandomizer;

import java.util.Date;

public class TestData {

    public TestData() {
    }

    @Randomizer(value = DateRangeRandomizer.class, args = {
            @RandomizerArgument(value = "2016-01-10 00:00:00", type = Date.class),
            @RandomizerArgument(value = "2016-01-30 23:59:59", type = Date.class)
    })
    private Date date;

    @Randomizer(value = IntegerRangeRandomizer.class, args = {
            @RandomizerArgument(value = "200", type = Integer.class),
            @RandomizerArgument(value = "500", type = Integer.class)
    })
    private int price;

    public Date getDate() {
        return date;
    }

    public int getPrice() {
        return price;
    }
}