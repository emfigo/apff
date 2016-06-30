# Longest Common Substring

### Input description

A set S of strings S1,...,Sn 

### Problem description

What is the longest string S' such that all the characters of S' appear as a substring or subsequence of each Si, 1 <= i <= n ?
NOTE: You can have more than one with the same size

### Goal

Your problem should return a list of the longest substrings present in the set

### Example

|         INPUT            |        Common Substrings Examples         |
|-------------------------:|------------------------------------------:|
| G C A A G T C T A A T A  |  G `C` `A` `A` G `T` C `T` `A` A `T` `A`  |
| C A A G G T T A T A T A  |  `C` `A` `A` G G `T` T A `T` `A` `T` `A`  |
| G C A A T T C T A T A A  |  G `C` `A` `A` `T` T C `T` `A` `T` `A` A  |
| C A A T T G A T A T A A  |  `C` `A` `A` `T` T G A `T` `A` `T` `A` A  |
| G C A A T C A T A T A T  |  G `C` `A` `A` `T` C A `T` `A` `T` `A` T  |

### Output

lcs -> #{ATA, CAA}