Farouq Alsalih 
32059151 
Project 1 
09/28/2021

I first created an empty string of the words 
that will be collected using my scanner. 
The first print statement asks the user to enter 
the width of each line, which would then be used
later on in the formatting process of the words the 
user wants to wrap.

Using the scanner tool, the response recorded by the user 
will be stored in int width. The second print statement 
asks the user to enter the words they want to wrap, and the 
first line of their response is recorded into a String nextLine.

Using a while loop, we will update the empty words string using 
the information string nextLine collects. Afterwards, the words
string will be updated once more to include a new line. The
user can keep inputting statements until they write "Stop."
in a newline without anything before or after "Stop." 
For example, writing
"Stop. Stop. Stop. Stop.
[enter]"
won't end the loop. However, writing something like
"Hello my name is Farouq
Stop."
does end the while loop. This is thanks to adding "\n" onto
words after words is updated during each iteration.

After the user ends the loop, there's some pre-processing that happens
to the words string. First, we remove any spaces following a single space. 
For example, "hello     my name is" would result in
"hello my name is". Another pre-processing effect would be to
remove all new lines created in words, and replace them with a single space.
The removal of newlines would help in the following loop function to 
scan each letter, and formatting it where each line has a maximum width of
int width. The for-function wouldn't have to deal with any newline characters
in the pre-processed words string.

The for-function scans each character, determining whether that character
is a whitespace (" "). The i being initialized is the index of the character 
being analyzed. The for-function keeps going until each character of the 
words string is all scanned. i keeps incrementing with each scan. I created
a char type that is defined as the current character being analyzed. If that
current character being analyzed is not a whitespace, then the letter would be added
to "word" until the letter following the word created is a whitespace, which then
would require going through a series of tests. If the character following the word
is a whitespace, then if the length of the word and lineLength exceed the width,
a new line would be created containing the word with a space AND has previous stored
finalBuffer information preceding the word. The lineLength would then be updated to take
into account the length of the word and the additional space added (1).In other words, if
the space added to a word means that the total of lineLength and word exceed width, a
a newline would be created. The word string would then reset. If the whitespace doesn't 
make the line exceed the width, then the the previous finalBuffer stored information, word,
and a space would be added together. Again, the lineLength would be updated. The word
would then be reset again. The loop starts again after the nested if statements are dealt with.

If we print finalBuffer as is, there would be a couple issues. For one, none of the "paragraphs" would
be separated with a newline in between. Another problem would be that the last word of words wouldn't be
added to finalBuffer. So, I replaced any double spaces back to back of finalBuffer with two new lines because
two spaces back to back indicates that two new lines should've been there (due to my pre-processing). 
My pre-processing replaces all newlines with a single space, so two spaces would mean that there should've
been two new lines. However, three newlines can be created with the replacement I created. So any three newlines
back to back would be replaced back to two newlines. This would equalize the space between paragraphs to all
be one newline. Lastly, to add the last word of the string that the user wants to wrap, we add a substring
of anything that follows the last space (" ") to finalBuffer.

Through my testing, I have noticed one bug. Sometimes, a single short word would be in its own line,
where there is nothing before or after it in that line. When that line with a single short word is created,
any following words would be stored in the lines that follow, not on that line with one small word.
I have went through hell trying to fix that bug, yet I can't figure out why it happens randomly.
For almost all of the printed formatted statements, it's correctly printed except the instances where this 
bug happens, which is not often at all.