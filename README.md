Is an understanding of probability a super power ?
================================================

Just the other day, I had an arguement with a friend of mine about how to make decisions.

Imagine if there are two choices for you :

Choice 1

<table>
<tr>
<td>Probability</td><td>Cost</td>
</tr>
<tr>
<td>P1</td><td>C1</td>
</tr>
<tr>
<td>P2</td><td>C2</td>
</tr>
</table>
<table>
<tr>
<td>Probability</td><td>Benefit</td>
</tr>
<tr>
<td>P3</td><td>B1</td>
</tr>
<tr>
<td>P4</td><td>B2</td>
</tr>
</table>

Choice 2

<table>
<tr>
<td>Probability</td><td>Cost</td>
</tr>
<tr>
<td>P5</td><td>C3</td>
</tr>
<tr>
<td>P6</td><td>C4</td>
</tr>
</table>
<table>
<tr>
<td>Probability</td><td>Benefit</td>
</tr>
<tr>
<td>P7</td><td>B3</td>
</tr>
<tr>
<td>P8</td><td>B4</td>
</tr>
</table>

How will you know which choice to make ?

Total Expected Cost of Choice 1 =
( P1 * C1 ) + ( P2 * C2 )

Total Expected Benefit of Choice 1 =
( P3 * B1 ) + ( P4 * B2 )


Similarly for Choice 2 :
Total Expected Cost of Choice 2 =
( P5 * C3 ) + ( P6 * C4 )

Total Expected Benefit of Choice 2 =
( P7 * B3 ) + ( P8 * B4 )

Therefore Net Expected Benefit of Choice 1 =

(( P3 * B1 ) + ( P4 * B2 )) - (( P1 * C1 ) + ( P2 * C2 ))

And Net Expected Benefit of Choice 2 =
(( P7 * B3 ) + ( P8 * B4 )) - (( P5 * C3 ) + ( P6 * C4 ))


Therefore the choice that we must make is whatever maximizes the above Net Expected Benefit, ie
the choice we must make is that choice with 
Max( { (( P3 * B1 ) + ( P4 * B2 )) - (( P1 * C1 ) + ( P2 * C2 )) }, { (( P7 * B3 ) + ( P8 * B4 )) - (( P5 * C3 ) + ( P6 * C4 )) } )

This game simulates the above two conditions :

One player is naive and picks a random choice from the list of choices available.
Other player is probabilistic and chooses the choice using the method described above.


A few test run results :
========================

Naive player wallet : 166.0
Probabilistic player wallet : 786.0

-----------------------------------

Naive player wallet : 490.0
Probabilistic player wallet : 490.0

-----------------------------------

Naive player wallet : 636.0
Probabilistic player wallet : 704.0

-----------------------------------

I have never seen the naive player beat the probabilistic player.
