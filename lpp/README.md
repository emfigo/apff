# Linear Partition Problem without Rearrangement

### Input description

An arrangement S of nonnegative numbers {S1, ... , Sn} and an integer K.

### Problem description

Partition S into Kor fewer ranges, to minimize the maximun sum over all the ranges, without reordering any of the numbers.

### Example

S = {100,200,300,400,500,600,700,800,900}

Suppose that three workers are given the task of scanning through a shelf of books in search of a given piece of information. To get the job done fairly and efficiently, the books are to be partitioned among the three workers. To avoid the need to rearrange the books or separate them into piles, it is simplest to devide the shelf into three regions and assign each region to one worker.

But what is the fairest way to divide up the shelf ?

lpp -> [[100, 200, 300, 400, 500], [600, 700], [800, 900]]

Where the largest job is 1700 pages and the smallest job is 1300.