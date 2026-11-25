# 91. Koko eating bananas

<div align="left">

![Difficulty: Medium](https://img.shields.io/badge/Difficulty-Medium-F59E0B?style=for-the-badge)
![Platform: takeUforward](https://img.shields.io/badge/Platform-takeUforward-E11D48?style=for-the-badge)
![Language: Java](https://img.shields.io/badge/Language-Java-ED8B00?style=for-the-badge)

</div>

## Difficulty: Medium

## Platform: takeUforward

## Problem Link
[View Problem](https://takeuforward.org/practice/dsa/koko-eating-bananas?tab=solution&solution=binary-search)

## Solved On
25 Nov 2026 at 09:58 pm

---

## Problem Description

<div><div class="mx-auto w-full py-4"><div class="relative mx-auto aspect-video overflow-hidden bg-black w-full"><div class="absolute inset-0 z-10"><div class="h-full w-full"></div></div></div></div></div><div data-article-segment="html-1" class="ArticleParser-module__R__VNG__article"><h3 id="solution-toc-intuition-nbsp"><strong>Intuition:&nbsp;</strong></h3>
<p>The idea here is to use binary search algorithm to solve this problem in a optimized way. Now, the search space will be in the range[1,max], where max is the maximum element in the array because the maximum bananas that the monkey can it per our can be the maximum element of the array.  As, the search space is sorted so binary search can be applied for better time complexity.</p>
<h3 id="solution-toc-approach-nbsp"><strong>Approach:&nbsp;</strong></h3>
<strong>Working of minimumRateToEatBananas(nums, h): </strong>
<ol>
<li>Starts by initializing low to 1 (minimum possible eating rate) and high to maximum element of the array using findMax function, which finds the maximum element in the given array. This sets up the binary search bounds where the eating rate will be searched.</li>
<li>Initialize a while loop that continues as long as low is less than or equal to high. Compute mid as the midpoint between low and high.</li>
<li>Use the function calculateTotalHours to estimate how many hours would be needed to eat all bananas in the array at the rate `mid` bananas per hour.</li>
<li>Compare total hour (total hours calculated at rate mid) with h (desired total hours), If total hour is less than or equal to h, it means the current eating rate mid is sufficient or possibly too high, so adjust high to mid - 1 to search for potentially smaller rates. Else, adjust low to mid + 1  to search for higher rates that might still satisfy the condition.</li>
<li>Once the binary search completes (low &gt; high), low represents the minimum eating rate such that eating all bananas within h hours is feasible.</li>
</ol><br>
<strong>Working of findMax(arr):</strong>
<ol>
<li>First initialize  a variable 'maxi', which will store maximum element of the array.</li>
<li>Now, literate through the array and find the maximum element among them, and return it.</li>
</ol><br>

<strong>Working of calculateTotalHours(arr,hourly):</strong>
<ol>
<li>Start with initializing n = size of array, which gives the number of elements in the array. Initialize 'totalH' to 0, which will accumulate the total hours required.
'hourly' represents the number of items that can be processed per hour.</li>
<li>Compute the number of hours required to eat all bananas at the rate of 'hourly' bananas per hour and store in 'totalH'.
Use ceil function to round up the division result to ensure that partial hours are counted correctly when necessary. Ater the traversal has ended, return 'totalH' as answer.</li>
</ol><br>


<h3 id="solution-toc-dry-run-nbsp"><strong>Dry Run:&nbsp;</strong></h3>

<h3 id="solution-toc-example-1">Example 1</h3></div><div><div class=""><div class="ImageSlider-module__5oY_MW__container"><div class="ImageSlider-module__5oY_MW__stage"><img alt="Koko Eating Bananas Binary Search" draggable="false" loading="lazy" width="0" height="0" decoding="async" data-nimg="1" class="ImageSlider-module__5oY_MW__image" src="https://static.takeuforward.org/content/1786626196_ft-v3_oW.webp" style="color: transparent;"></div><div class="ImageSlider-module__5oY_MW__controlBar"><div class="ImageSlider-module__5oY_MW__controlIsland ImageSlider-module__5oY_MW__controlIslandGrow"><p class="ImageSlider-module__5oY_MW__controlCaption">Koko Eating Bananas Binary Search</p></div><div class="ImageSlider-module__5oY_MW__controlIsland"><div class="ImageSlider-module__5oY_MW__controlActions"><div class="flex items-center"></div></div></div></div></div></div></div><div data-article-segment="html-2" class="ArticleParser-module__R__VNG__article"><h3 id="solution-toc-example-2">Example 2</h3></div><div><div class=""><div class="ImageSlider-module__5oY_MW__container"><div class="ImageSlider-module__5oY_MW__stage"><img alt="Koko Eating Bananas Binary Search" draggable="false" loading="lazy" width="0" height="0" decoding="async" data-nimg="1" class="ImageSlider-module__5oY_MW__image" src="https://static.takeuforward.org/content/1786626200_FqP8sweW.webp" style="color: transparent;"></div><div class="ImageSlider-module__5oY_MW__controlBar"><div class="ImageSlider-module__5oY_MW__controlIsland ImageSlider-module__5oY_MW__controlIslandGrow"><p class="ImageSlider-module__5oY_MW__controlCaption">Koko Eating Bananas Binary Search</p></div><div class="ImageSlider-module__5oY_MW__controlIsland"><div class="ImageSlider-module__5oY_MW__controlActions"><div class="flex items-center"></div></div></div></div></div></div></div><div data-article-segment="html-3" class="ArticleParser-module__R__VNG__article"><h3 id="solution-toc-solution-nbsp"><strong>Solution:&nbsp;</strong></h3></div><div><div class="code-viewer-module__f5DVea__container"><div class="code-viewer-module__f5DVea__wrapper" style="--code-viewer-surface: var(--color-bg-4); --code-viewer-editor-surface: var(--color-bg-4);"><div class="code-viewer-module__f5DVea__header_wrapper"></div></div></div></div><div data-article-segment="html-trailing" class="ArticleParser-module__R__VNG__article"><h3 id="solution-toc-complexity-analysis-nbsp"><strong>Complexity Analysis:&nbsp;</strong></h3>
<strong>Time Complexity:</strong>O(N * log(max)), where max is the maximum element in the array and N is size of the array. We are applying Binary search for the range [1, max], and for every value of ‘mid’, we are traversing the entire array inside the function named calculateTotalHours().<br><br>
<strong>Space Complexity:</strong> As no additional space is used, so the Space Complexity is O(1).</div>

---

## Solutions

### [solution1.java](./solution1.java)
- **Language:** Java

---
*Auto-committed via [SyncCodeX Extension](https://github.com)*
