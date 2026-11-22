# 106. Longest Repeating Character Replacement

<div align="left">

![Difficulty: Medium](https://img.shields.io/badge/Difficulty-Medium-F59E0B?style=for-the-badge)
![Platform: takeUforward](https://img.shields.io/badge/Platform-takeUforward-E11D48?style=for-the-badge)
![Language: Java](https://img.shields.io/badge/Language-Java-ED8B00?style=for-the-badge)

</div>

## Difficulty: Medium

## Platform: takeUforward

## Problem Link
[View Problem](https://takeuforward.org/practice/dsa/longest-repeating-character-replacement?tab=solution&solution=better)

## Solved On
22 Nov 2026 at 09:24 pm

---

## Problem Description

<div><div class="mx-auto w-full py-4"><div class="relative mx-auto aspect-video overflow-hidden bg-black w-full"><div class="absolute inset-0 z-10"><div class="h-full w-full"></div></div></div></div></div><div data-article-segment="html-1" class="ArticleParser-module__R__VNG__article"><h3 id="solution-toc-intuition"><strong>Intuition: </strong></h3>
<p>The idea here is to use the sliding window technique to solve this problem optimally. This method efficiently finds the longest substring  with frequency counting and dynamic adjustments to ensure validity of the window. First expand the window and add those substring that validates the condition and when  it crosses the limit, again shrink the window by moving the left pointer. This process ensures to provide a linear time complexity.</p>
<h3 id="solution-toc-approach"><strong>Approach: </strong></h3>
<li>First initialize few variables: <code>l </code>(left) and <code>r</code> (right) as 0 to define the current window in the string, <code>maxLen</code> as 0 to track the maximum length of valid substrings,  <code>maxFreq</code> as 0 to monitor the highest frequency of any single character within the current window. Also, maintain a frequency array <code>hash</code>  to count occurrences of characters.
</li><li>Incrementally expand the window by moving the r pointer to the right. Update the frequency of the current character in hash and adjust maxFreq if this frequency exceeds the current maxFreq.
</li><li>Check if the number of characters that need replacement exceeds k. If so, slide the l pointer to the right until the window becomes valid again. Adjust the frequencies in hash and update maxFreq accordingly.
</li><li>After ensuring the window is valid, update maxLen with the length of the current window. Finally, return maxLen, which holds the length of the longest substring.</li>

<h3 id="solution-toc-dry-run">Dry run:</h3>

<h6>Example 1</h6></div><div><div class=""><div class="ImageSlider-module__5oY_MW__container"><div class="ImageSlider-module__5oY_MW__stage"><img alt="Image 1" draggable="false" loading="lazy" width="0" height="0" decoding="async" data-nimg="1" class="ImageSlider-module__5oY_MW__image" src="https://static.takeuforward.org/content/1788006709_xQbvCHCA.webp" style="color: transparent;"></div><div class="ImageSlider-module__5oY_MW__controlBar"><div class="ImageSlider-module__5oY_MW__controlIsland"><span class="ImageSlider-module__5oY_MW__pagination">1 / 2</span></div><div class="ImageSlider-module__5oY_MW__controlIsland ImageSlider-module__5oY_MW__controlIslandGrow"><p class="ImageSlider-module__5oY_MW__controlCaption">Image 1</p></div><div class="ImageSlider-module__5oY_MW__controlIsland"><div class="ImageSlider-module__5oY_MW__controlActions"><div class="flex items-center"><div class="flex h-3 shrink-0 items-center"><div class="shrink-0 bg-border my-auto mx-1 self-stretch" role="separator" aria-orientation="vertical" style="width: 1px; height: 100%;"></div></div><div class="flex h-3 shrink-0 items-center"><div class="shrink-0 bg-border my-auto mx-1 self-stretch" role="separator" aria-orientation="vertical" style="width: 1px; height: 100%;"></div></div></div></div></div></div></div></div></div><div data-article-segment="html-2" class="ArticleParser-module__R__VNG__article"><h6>Example 2</h6></div><div><div class=""><div class="ImageSlider-module__5oY_MW__container"><div class="ImageSlider-module__5oY_MW__stage"><img alt="Dry run example 2" draggable="false" loading="lazy" width="0" height="0" decoding="async" data-nimg="1" class="ImageSlider-module__5oY_MW__image" src="https://static.takeuforward.org/content/1788006751_AWqNUrow.webp" style="color: transparent;"></div><div class="ImageSlider-module__5oY_MW__controlBar"><div class="ImageSlider-module__5oY_MW__controlIsland ImageSlider-module__5oY_MW__controlIslandGrow"><p class="ImageSlider-module__5oY_MW__controlCaption">Dry run example 2</p></div><div class="ImageSlider-module__5oY_MW__controlIsland"><div class="ImageSlider-module__5oY_MW__controlActions"><div class="flex items-center"></div></div></div></div></div></div></div><div><div class="code-viewer-module__f5DVea__container"><div class="code-viewer-module__f5DVea__wrapper" style="--code-viewer-surface: var(--color-bg-4); --code-viewer-editor-surface: var(--color-bg-4);"><div class="code-viewer-module__f5DVea__header_wrapper"></div></div></div></div><div data-article-segment="html-trailing" class="ArticleParser-module__R__VNG__article"><h3 id="solution-toc-complexity-analysis"><strong>Complexity Analysis:&nbsp;</strong></h3>
<strong>Time Complexity:</strong>O((N+N) * 26), where N is the size of the array. The right pointer runs for N times and the left pointer runs for N times throughout. The for loop takes extra O(26) to claculate the maximum frequency. <br><br>
<strong>Space Complexity:</strong> O(26) . Hash array to store all the characters.</div>

---

## Solutions

### [solution1.java](./solution1.java)
- **Language:** Java

---
*Auto-committed via [SyncCodeX Extension](https://github.com)*
