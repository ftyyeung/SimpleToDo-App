# Pre-work - *SimpleToDo*

**SimpleToDo** is an android app that allows building a todo list and basic todo items management functionality including adding new items, editing and deleting an existing item.

Submitted by: **Franki Yeung**

Time spent: **1.5** hours spent in total

## User Stories

The following **required** functionality is completed:

* [X] User can **successfully add and remove items** from the todo list
* [X] User can **tap a todo item in the list and bring up an edit screen for the todo item** and then have any changes to the text reflected in the todo list.
* [X] User can **persist todo items** and retrieve them properly on app restart

The following **optional** features are implemented:

* [ ] Persist the todo items [into SQLite](http://guides.codepath.com/android/Persisting-Data-to-the-Device#sqlite) instead of a text file
* [ ] Improve style of the todo items in the list [using a custom adapter](http://guides.codepath.com/android/Using-an-ArrayAdapter-with-ListView)
* [ ] Add support for completion due dates for todo items (and display within listview item)
* [ ] Use a [DialogFragment](http://guides.codepath.com/android/Using-DialogFragment) instead of new Activity for editing items
* [ ] Add support for selecting the priority of each todo item (and display in listview item)
* [ ] Tweak the style improving the UI / UX, play with colors, images or backgrounds

The following **additional** features are implemented:

* [ ] List anything else that you can get done to improve the app functionality!

## Video Walkthrough

Here's a walkthrough of implemented user stories:

<img src='https://github.com/ftyyeung/SimpleToDo-App/blob/master/SimpleToDo.gif?raw=true' title='Video Walkthrough' width='' alt='Video Walkthrough' />

GIF created with [LiceCap](http://www.cockos.com/licecap/).

## Project Analysis

As part of your pre-work submission, please reflect on the app and answer the following questions below:

**Question 1:** "What are your reactions to the Android app development platform so far? Compare and contrast Android's approach to layouts and user interfaces in past platforms you've used."

**Answer:** As someone whose primary choice of coding language is Java, Android Application in Android Studio was definitely a familiar sight. I found all logical development to be straight forward and well documented. The use of gradle to handle configuration and dependencies also proves to be much easier than before. Android's approach in layout design appears to be mediocre however. While raw XML editing is certainly useful, the graphical layout tool proves to be far behind in comparison to Xcode. Constraints and screen segues are much more intuitive within Xcode.

**Question 2:** "Take a moment to reflect on the `ArrayAdapter` used in your pre-work. How would you describe an adapter in this context and what is its function in Android? Why do you think the adapter is important? Explain the purpose of the `convertView` in the `getView` method of the `ArrayAdapter`."

**Answer:** The use of the ArrayAdapter in this context was to couple the data and the view together. Without the use of the ArrayAdapter, a considerable and redundent amount of work would need to be done every time items are removed or added to the data list in order to correctly populate the view correctly. The use of an adapter allows for easy separation yet paralellism between data store and UI views. It also mitigates chances of errors, such as forgetting to update the view after changing the data. 
Since a Listview can support many items, the adapter must have some way of populating more views as the list scrolls. This is done via getView. Since the area of the screen remains the same as the user scrolls through the list, there will always be a maximum number of views that can be present on the ListView at a given time. As old views are transitioned off the screen, new views needs to be formed. ConvertView allows for old views to be changed to display new items. This eliminates the need for instantiating 100 views for 100 items if only 5 can be seen at any given time.

## Notes

Describe any challenges encountered while building the app.

None encountered.

## License

    Copyright [2017] [Franki Yeung]

    Licensed under the Apache License, Version 2.0 (the "License");
    you may not use this file except in compliance with the License.
    You may obtain a copy of the License at

        http://www.apache.org/licenses/LICENSE-2.0

    Unless required by applicable law or agreed to in writing, software
    distributed under the License is distributed on an "AS IS" BASIS,
    WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
    See the License for the specific language governing permissions and
    limitations under the License.
