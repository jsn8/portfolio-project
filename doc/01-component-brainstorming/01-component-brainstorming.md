# Portfolio Part 1: Component Brainstorming

- **Name**: Jacob Kim
- **Dot Number**: kim.8934
- **Due Date**: 09/13 @ 12:40 PM EST

## Assignment Overview


The overall goal of the portfolio project is to have you design and implement
your own OSU component. There are no limits to what you choose to design and
implement, but your component must fit within the constraints of our software
sequence discipline. In other words, the component must extend from Standard and
must include both a kernel and a secondary interface.

Because this is a daunting project, we will be providing you with a series of
activities to aid in your design decisions. For example, the point of this
assignment is to help you brainstorm a few possible components and get some
feedback. For each of these components, you will need to specify the high-level
design in terms of the software sequence discipline. In other words, you will
describe a component, select a few kernel methods for your component, and select
a few secondary methods to layer on top of your kernel methods.

You are not required to specify contracts at this time. However, you are welcome
to be as detailed as you'd like. More detail means you will be able to get more
detailed feedback, which may help you decide which component to ultimately
implement.

## Assignment Checklist


To be sure you have completed everything on this assignment, we have littered
this document with TODO comments. You can browse all of them in VSCode by
opening the TODOs window from the sidebar. The icon looks like a tree and will
likely have a large number next to it indicating the number of TODOS. You'll
chip away at that number over the course of the semester. However, if you'd
like to remove this number, you can disable it by removing the following
line from the `settings.json` file:

```json
"todo-tree.general.showActivityBarBadge": true,
```

Which is not to be confused with the following setting that adds the counts
to the tree diagram (you may remove this one as well):

```json
"todo-tree.tree.showCountsInTree": true,
```

## Assignment Learning Objectives


Without learning objectives, there really is no clear reason why a particular
assessment or activity exists. Therefore, to be completely transparent, here is
what we're hoping you will learn through this particular aspect of the portfolio
project. Specifically, students should be able to:

1. Integrate their areas of interest in their personal lives and/or careers with
   their knowledge of software design
2. Determine the achievablility of a software design given time constraints
3. Design high-level software components following the software sequence
   discipline

## Assignment Rubric: 10 Points


Again, to be completely transparent, most of the portfolio project, except the
final submission, is designed as a formative assessment. Formative assessments
are meant to provide ongoing feedback in the learning process. Therefore,
the rubric is designed to assess the learning objectives *directly* in a way
that is low stakes—meaning you shouldn't have to worry about the grade. Just
do good work.

1. (3 points) Each design must align with your personal values and long-term
   goals. Because the goal of this project is to help your build out a
   portfolio, you really ought to care about what you're designing. We'll give
   you a chance to share your personal values, interests, and long-term goals
   below.
2. (3 points) Each design must be achievable over the course of a single
   semester. Don't be afraid to design something very small. There is no shame
   in keeping it simple.
3. (4 points) Each design must fit within the software sequence discipline. In
   other words, your design should expect to inherit from Standard, and it
   should contain both kernel and secondary methods. Also, null and aliasing
   must be avoided, when possible. The methods themselves must also be in
   justifiable locations, such as kernel or secondary.

## Pre-Assignment

> Before you jump in, we want you to take a moment to share your interests
> below. Use this space to talk about your career goals as well as your personal
> hobbies. These will help you clarify your values before you start
> brainstorming. Plus it helps us get to know you better! Feel free to share
> images in this section.

Some of my interests include sports, games, and music.

Sports has been a cornerstone of who I am. I grew up with basketball and continue to love it endlessly. Recently, I have also learned to love soccer, though I had completely hated it and thought it was stupid in my youth. I have a really strange spread of sports teams across different leagues. I was born in South Caroline and live in Akron, OH, but none of my favorite teams are anywhere close to those two places. My favorite NBA team is the Phoenix Suns (A few years back, their star Shooting Guard, Devin Booker, scored 70 points in one game and my dad had said it was a fluke, and out of spite I have been following their team since.They are a really fun team to watch, but they always underperform in the playoffs). My favorite Premier League team is West Ham United (A buddy of mine is really big into soccer and wanted me to join the train of soccer love. She just told me to pick a team and I saw a team called "West Ham" and thought it was funny, so I ran with it. I watch their matches every weekend, but again very underwhelming. Still have fun when they do good though!). I never really had an NFL team but one year my buddies had a Super Bowl party and it was the Eagles vs the Chiefs. I really did not want the Chiefs to win because they always win, so I cheered for the Eagles and have supported them since. I like the Mets as a joke, but honestly they are not doing too bad this year. I have a Devin Booker jersey, Suns Steve Nash jersey, a 17/18 West Ham jersey, and a really stupid Mets shirt.

I love games. I am a really competitive person by nature and I always really want to win. Euchre has been one of my favorite card games in the past year or two and my friends and I have had to go on a hiatus of sorts because we had played it so much. I also like pickleball a lot, though I am not very good at it. I grew up playing a lot of Minecraft and had always dreamed of being a Minecraft YouTuber. These days, I play a lot of Fortnite (it is really fun after you get passed the fact it is a kids game), Pokemon Showdown, Lethal Company, and Overwatch. Another game I like to play is gambling (Buying and opening Pokemon cards). I really like to buy Pokemon cards because I get to see a cool little piece of cardboard worth $0.33 after spending $5 on a pack. It's just really fun thinking about the possibilities of maybe hitting it big. I have moved on though becuase I may or may not be in financial ruin after going to college with my own money.

Music has been huge for me as well. I played the piano in my youth and as I grew up picked up the alto saxophone. Love the sax. I played in jazz band, concert band, marching band, you name it. I was the drum major for my high school's marching band and 1st chair for jazz band. As I got to college though, I have not had the time to practie nor play, but I hope my abilities do not dissipate after so long. Music helps get me through the day. I really listen to an ungodly amount of music. Studying, walking to class, sleeping, literally all the time music is playing. It was hard for me to figure out what I like, but the genre(s) of music I have come to embrace as my favorite is neo-R&B-soul-indie-pop-rap-funk. It's a weird spread but Childish Gambino is my favoritest artist ever and he genuinely hits all the points there.

In my future, say, 20 years down the line, I do not want to be programming anymore. As much as I find programming and its applications so very rewarding and cool and awesome, I feel like I do not want to do it forever. I feel like there is a fine line and that there will be a point of burnout and being done with it, and that is OK! My one friend's dad was a super genius computer engineer and coder, but these days he has his MBA and works more in the administrative side of engineering and such. I feel like that is the pipeline that I would like to follow. I am also getting a busniess minor now so I feel like it is totally doable.

Thanks for listening!

## Assignment


As previously stated, you are tasked with brainstorming 3 possible components.
To aid you in this process, we have provided [some example components][example-components]
that may help you in your brainstorming. All of these components were made at
some point by one of your peers, so you should feel confident that you can
accomplish any of them.


There is no requirement that you use any of the components listed above.
If you want to model something else, go for it! Very common early object
projects usually attempt to model real-world systems like banks, cars,
etc. Make of this whatever seems interesting to you, and keep in mind that
you're just brainstorming right now. You do not have to commit to anything.

### Example Component


To help you brainstorm a few components, we've provided an example below of a
component you already know well: NaturalNumber. We highly recommend that you
mirror the formatting as close as possible in your designs. By following this
format, we can be more confident that your designs will be possible.

- Example Component: `NaturalNumber`
  - **Description**:
    - The purpose of this component is to model a non-negative
      integer. Our intent with this design was to keep a simple kernel that
      provides the minimum functionality needed to represent a natural number.
      Then, we provide more complex mathematical operations in the secondary
      interface.
  - **Kernel Methods**:
    - `void multiplyBy10(int k)`: multiplies `this` by 10 and adds `k`
    - `int divideBy10()`: divides `this` by 10 and reports the remainder
    - `boolean isZero()`: reports whether `this` is zero
  - **Secondary Methods**:
    - `void add(NaturalNumber n)`: adds `n` to `this`
    - `void subtract(NaturalNumber n)`: subtracts `n` from `this`
    - `void multiply(NaturalNumber n)`: multiplies `this` by `n`
    - `NaturalNumber divide(NaturalNumber n)`: divides `this` by `n`, returning
      the remainder
    - ...
  - **Additional Considerations** (*note*: "I don't know" is an acceptable
    answer for each of the following questions):
    - Would this component be mutable? Answer and explain:
      - Yes, basically all OSU components have to be mutable as long as they
        inherit from Standard. `clear`, `newInstance`, and `transferFrom` all
        mutate `this`.
    - Would this component rely on any internal classes (e.g., `Map.Pair`)?
      Answer and explain:
        - No. All methods work with integers or other NaturalNumbers.
    - Would this component need any enums or constants (e.g.,
      `Program.Instruction`)? Answer and explain:
        - Yes. NaturalNumber is base 10, and we track that in a constant called
          `RADIX`.
    - Can you implement your secondary methods using your kernel methods?
      Answer, explain, and give at least one example:
      - Yes. The kernel methods `multiplyBy10` and `divideBy10` can be used to
        manipulate our natural number as needed. For example, to implement
        `increment`, we can trim the last digit off with `divideBy10`, add 1 to
        it, verify that the digit hasn't overflown, and multiply the digit back.
        If the digit overflows, we reset it to zero and recursively call
        `increment`.

Keep in mind that the general idea when putting together these layered designs
is to put the minimal implementation in the kernel. In this case, the kernel is
only responsible for manipulating a digit at a time in the number. The secondary
methods use these manipulations to perform more complex operations like
adding two numbers together.

Also, keep in mind that we don't know the underlying implementation. It would be
completely reasonable to create a `NaturalNumber1L` class which layers the
kernel on top of the existing `BigInteger` class in Java. It would also be
reasonable to implement `NaturalNumber2` on top of `String` as seen in
Project 2. Do not worry about your implementations at this time.

On top of everything above, there is no expectation that you have a perfect
design. Part of the goal of this project is to have you actually use your
component once it's implemented to do something interesting. At which point, you
will likely refine your design to make your implementation easier to use.

### Component Designs

> Please use this section to share your designs.

- Component Design #1: Spinner/Roulette
  - **Description**:
    Data structure used to return a random element, but elements can have higher or lower rates of returning values. Think about it like Set's big brother. Each element has a specific count associated with it and when removing an element, the odds point to "slices" with higher count sizes. When a slice has been selected, the count reduces by one.
  - **Kernel Methods**:
    - 'int numSlices()': returns the number of slices this particular value has
    - 'T spin()': removes and decrements a slice of the wheel
    - 'void addSlice(T x)': adds a slice to the wheel, if slice value exists already, increments the count
  - **Secondary Methods**:
    - 'double odds(T x)': returns the odds that a certain x has of landing on it
    - 'int uniqueCount()': returns the number of unique slice values of this
    - 'int spinnerSize()': returns the total amount of slices of this
    - 'void duplicateSlices(T x, int i)': duplicates an existing value of x i times
    - 'T x removeSlice(T x, int i)': removes an existing value of x i times
    - 'boolean contains(T x)': checks to see if x exists within this
  - **Additional Considerations** (*note*: "I don't know" is an acceptable
    answer for each of the following questions):
    - Would this component be mutable? Answer and explain:
      Yes, it can grow and shrink as the user pleases
    - Would this component rely on any internal classes (e.g., `Map.Pair`)?
      Answer and explain:
      Maybe? Slice can be its own class? Spinner.Slice perhaps? Like map, one component holding the value and one holding the count? We shall see
    - Would this component need any enums or constants (e.g.,
      `Program.Instruction`)? Answer and explain:
      I do not know what this means?
    - Can you implement your secondary methods using your kernel methods?
      Answer, explain, and give at least one example:
      Absolutely. Odds() uses the numSlices method to find the total and the individual slice distribution. Then it would calculate the odds of the value being picked through a spin.


- Component Design #2: Notecard
  - **Description**:
    Data structure that holds a definition and a term. Like a map. The elements can be removed like a queue. The elements can also be shuffled, so that the elements would be removed at different times if needed. Data can also hold if it is a known term or an unknown term. Known terms are removed from the set and unknown terms are re-added to the end of the queue.
  - **Kernel Methods**:
    'void addCard(T term, T definition, boolean known)' or 'void addCard(T x, T definition)': adds a card to the list. Baseline (I forget the correct coding term), is that the card is unknown
    '(T x, T y, boolean known) removeCard()': removes a card from the front of this
    'int numCards()': returns the number of notecards
  - **Secondary Methods**:
    'void shuffle()': "shuffles" this. the order and indexes of elements are randomized
    'void changeKnown(boolean known, T term)': changes the known value of a card
    'T definition getDefinition(T term)': gets a given term element's definition
    'boolean contains(T term)': sees if a given term exists within this
  - **Additional Considerations** (*note*: "I don't know" is an acceptable
    answer for each of the following questions):
    - Would this component be mutable? Answer and explain:
      Yes the set can dynamically change, grow and shrink as well as access the data
    - Would this component rely on any internal classes (e.g., `Map.Pair`)?
      Answer and explain:
      I definitely think there should be an internal class of card to hold all three components of the structure. It will get really annoying if there has to be three variables everytime. Much rather have it implicityly made within its own structure.
    - Would this component need any enums or constants (e.g.,
      `Program.Instruction`)? Answer and explain:
      Still don't get this I won't lie.
    - Can you implement your secondary methods using your kernel methods?
      Answer, explain, and give at least one example:
      ChangeKnown could be implemented in a for each loop where each element is taken out through removeCard(). Each card will be checked, and when the given card is found, a new card can be made with the opposite known value.


- Component Design #3: Artificial Neuron
  - **Description**:
    - I'll be honest I do not completely understand how this is supposed to work. To my understanding, data points are inputted, each with a given weight. Then, the weights are multiplied by the inputted values. They are then summed up and then put into an activation function, resulting in some value. I do not know what this is supposed to do really, I will ask Jeremy later, but it sounds interesting.
  - **Kernel Methods**:
    void addPoint(T x, T x): adds a point to this, used for further calculations
    Point(T x, T x) removePoint(): removes a point from this, a value and a weight
    int numPoints(): counts how many point there are in the neuron
  - **Secondary Methods**:
    T x calculate(): sums and calculates the points into the output value
    void sortPoints(): sorts the points from least to greatest
    T x partialCalulation(int i, int j): calculates a given starting and ending indexes values
    T x weightTimesValue(T x): gives the weight * value of a point
  - **Additional Considerations** (*note*: "I don't know" is an acceptable
    answer for each of the following questions):
    - Would this component be mutable? Answer and explain:
      Yes.
    - Would this component rely on any internal classes (e.g., `Map.Pair`)?
      Answer and explain:
      Probably neuron.Point. Gives the combination of a value and weight
    - Would this component need any enums or constants (e.g.,
      `Program.Instruction`)? Answer and explain:
      I don't think so
    - Can you implement your secondary methods using your kernel methods?
      Answer, explain, and give at least one example:
      sortPoints really only needs the removePoint() kernel method and an implemented sorting algorythm to put things in the correct order. Or simply import the comparator

## Post-Assignment

The following sections detail everything that you should do once you've
completed the assignment.

### Changelog


At the end of every assignment, you should update the
[CHANGELOG.md](../../CHANGELOG.md) file found in the root of the project folder.
Since this is likely the first time you've done this, we would recommend
browsing the existing file. It includes all of the changes made to the portfolio
project template. When you're ready, you should delete this file and start your
own. Here's what I would expect to see at the minimum:

```markdown
# Changelog

All notable changes to this project will be documented in this file.

The format is based on [Keep a Changelog](https://keepachangelog.com/en/1.1.0/),
and this project adheres to [Calendar Versioning](https://calver.org/) of
the following form: YYYY.0M.0D.

## 2024.09.16

### Added

- Designed a Spinner component
- Designed a Notecard component
- Designed a Artificial Neuron component
```

Here `YYYY.MM.DD` would be the date of your submission, such as 2024.04.21.

You may notice that things are nicely linked in the root CHANGELOG. If you'd
like to accomplish that, you will need to make GitHub releases after each pull
request merge (or at least tag your commits). This is not required.

In the future, the CHANGELOG will be used to document changes in your
designs, so we can gauge your progress. Please keep it updated at each stage
of development.

### Submission


If you have completed the assignment using this template, we recommend that
you convert it to a PDF before submission. If you're not sure how, check out
this [Markdown to PDF guide][markdown-to-pdf-guide]. However, PDFs should be
created for you automatically every time you save, so just double check that
all your work is there before submitting. For future assignments, you will
just be submitting a link to a pull request. This will be the only time
you have to submit any PDFs.


### Peer Review


Following the completion of this assignment, you will be assigned three
students' component brainstorming assignments for review. Your job during the
peer review process is to help your peers flesh out their designs. Specifically,
you should be helping them determine which of their designs would be most
practical to complete this semester. When reviewing your peers' assignments,
please treat them with respect. Note also that we can see your comments, which
could help your case if you're looking to become a grader. Ultimately, we
recommend using the following feedback rubric to ensure that your feedback is
both helpful and respectful (you may want to render the markdown as HTML or a
PDF to read this rubric as a table).

| Criteria of Constructive Feedback | Missing                                                                                                                           | Developing                                                                                                                                                                                                                                | Meeting                                                                                                                                                               |
| --------------------------------- | --------------------------------------------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------------------------------------------------------------------------------- |
| Specific                          | All feedback is general (not specific)                                                                                            | Some (but not all) feedback is specific and some examples may be provided.                                                                                                                                                                | All feedback is specific, with examples provided where possible                                                                                                       |
| Actionable                        | None of the feedback provides actionable items or suggestions for improvement                                                     | Some feedback provides suggestions for improvement, while some do not                                                                                                                                                                     | All (or nearly all) feedback is actionable; most criticisms are followed by suggestions for improvement                                                               |
| Prioritized                       | Feedback provides only major or minor concerns, but not both. Major and minar concerns are not labeled or feedback is unorganized | Feedback provides both major and minor concerns, but it is not clear which is which and/or the feedback is not as well organized as it could be                                                                                           | Feedback clearly labels major and minor concerns. Feedback is organized in a way that allows the reader to easily understand which points to prioritize in a revision |
| Balanced                          | Feedback describes either strengths or areas of improvement, but not both                                                         | Feedback describes both strengths and areas for improvement, but it is more heavily weighted towards one or the other, and/or descusses both but does not clearly identify which part of the feedback is a strength/area for improvement  | Feedback provides balanced discussion of the document's strengths and areas for improvement. It is clear which piece of feedback is which                             |
| Tactful                           | Overall tone and language are not appropriate (e.g., not considerate, could be interpreted as personal criticism or attack)       | Overall feedback tone and language are general positive, tactul, and non-threatening, but one or more feedback comments could be interpretted as not tactful and/or feedback leans toward personal criticism, not focused on the document | Feedback tone and language are positive, tactful, and non-threatening. Feedback addesses the document, not the writer                                                 |

### Assignment Feedback

If you'd like to give feedback for this assignment (or any assignment, really),
make use of [this survey][survey]. Your feedback helps make assignments
better for future students.

<!-- TODO: follow the link to share your feedback then delete this comment -->

[example-components]: https://therenegadecoder.com/code/the-never-ending-list-of-small-programming-project-ideas/
[markdown-to-pdf-guide]: https://therenegadecoder.com/blog/how-to-convert-markdown-to-a-pdf-3-quick-solutions/
[survey]: https://forms.gle/dumXHo6A4Enucdkq9
