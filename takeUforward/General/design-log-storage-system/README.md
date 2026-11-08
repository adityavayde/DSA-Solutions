# [527. Design Log Storage SystemPOTD](https://takeuforward.org/practice/dsa/design-log-storage-system?solution=optimal)

![Difficulty: Core](https://img.shields.io/badge/Difficulty-Core-eab308?style=for-the-badge)

---

## 📝 Problem Statement

You are given several logs, where each log contains a unique ID and timestamp. Timestamp is a string that has the following format:&nbsp; **Year:Month:Day:Hour:Minute:Second** , for example,&nbsp; **2017:01:01:23:59:59** . All domains are zero-padded decimal numbers.

Implement the **LogSystem** &nbsp;class:

- **LogSystem()** &nbsp;Initializes the LogSystem **** object.
- **void put(int id, string timestamp)** &nbsp;Stores the given log(id, timestamp)&nbsp;in your storage system.
- **int[] retrieve(string start, string end, string granularity)** &nbsp;Returns the IDs of the logs whose timestamps are within the range from **start** &nbsp;to **end** &nbsp;inclusive. **start** &nbsp;and **end** &nbsp;all have the same format as **timestamp** , and **granularity** &nbsp;means how precise the range should be (i.e. to the exact **Day** , **Minute** , etc.). For example,&nbsp; **start = "2017:01:01:23:59:59"** ,&nbsp; **end = "2017:01:02:23:59:59",** and&nbsp; **granularity = "Day"** &nbsp;means that we need to find the logs within the inclusive range from&nbsp; **Jan. 1st 2017** &nbsp;to&nbsp; **Jan. 2nd 2017** , and the&nbsp; **Hour** , **Minute** , and **Second** &nbsp;for each log entry can be ignored.

### Example 1:

**Input:** ["LogSystem", "put", "put", "put", "retrieve", "retrieve"]

[[], [1, "2017:01:01:23:59:59"], [2, "2017:01:01:22:59:59"], [3, "2016:01:01:00:00:00"], ["2016:01:01:01:01:01", "2017:01:01:23:00:00", "Year"], ["2016:01:01:01:01:01", "2017:01:01:23:00:00", "Hour"]]

**Output:** [null, null, null, null, [3, 2, 1], [2, 1]]

**Explanation:** LogSystem logSystem = new LogSystem();

logSystem.put(1, "2017:01:01:23:59:59");

logSystem.put(2, "2017:01:01:22:59:59");

logSystem.put(3, "2016:01:01:00:00:00");

// return [3,2,1], because you need to return all logs between 2016 and 2017.

logSystem.retrieve("2016:01:01:01:01:01", "2017:01:01:23:00:00", "Year");

// return [2,1], because you need to return all logs between Jan. 1, 2016 01:XX:XX and Jan. 1, 2017 23:XX:XX.

// Log 3 is not returned because Jan. 1, 2016 00:00:00 comes before the start of the range.

logSystem.retrieve("2016:01:01:01:01:01", "2017:01:01:23:00:00", "Hour");

### Example 2:

**Input:** ["LogSystem", "put", "put", "put", "retrieve", "retrieve"]

[[], [1, "2017:01:01:23:59:59"], [2, "2017:01:01:22:59:59"], [3, "2016:01:01:00:00:00"], ["2016:01:01:01:01:01", "2017:01:01:23:00:00", "Year"], ["2016:01:01:01:01:01", "2017:01:01:23:00:00", "Hour"]]

**Output:** [null, null, null, null, [3, 2, 1], [2, 1]]

**Explanation:** LogSystem logSystem = new LogSystem();

logSystem.put(1, "2017:01:01:23:59:59");

logSystem.put(2, "2017:01:01:22:59:59");

logSystem.put(3, "2016:01:01:00:00:00");

// return [3,2,1], because you need to return all logs between 2016 and 2017.

logSystem.retrieve("2016:01:01:01:01:01", "2017:01:01:23:00:00", "Year");

// return [2,1], because you need to return all logs between Jan. 1, 2016 01:XX:XX and Jan. 1, 2017 23:XX:XX.

// Log 3 is not returned because Jan. 1, 2016 00:00:00 comes before the start of the range.

logSystem.retrieve("2016:01:01:01:01:01", "2017:01:01:23:00:00", "Hour");

Still unsure what the problem is asking ?

Let’s go through a few more examples, step by step, to make it clearer.

### Example 3:

**Input:** ["LogSystem", "put", "put", "put", "retrieve", "retrieve"]

[[], [1, "2017:01:01:23:59:59"], [2, "2017:01:01:22:59:59"], [3, "2016:01:01:00:00:00"], ["2016:01:01:01:01:01", "2017:01:01:23:00:00", "Year"], ["2016:01:01:01:01:01", "2017:01:01:23:00:00", "Hour"]]

### Constraints

- 1 <= id <= 500
- 2000 <= Year <= 2017
- 1 <= Month <= 12
- 1 <= Day <= 31
- 0 <= Hour <= 23
- 0 <= Minute, Second <= 59
- granularity is one of the values ["Year", "Month", "Day", "Hour", "Minute", "Second"].
- At most 500 calls will be made to put and retrieve.

---

## 💡 Complexity Analysis

- **Time Complexity:** $\mathcal{O}(N)$
- **Space Complexity:** $\mathcal{O}(1)$

---

<p align="center">
  Generated with ❤️ by <a href="https://github.com/Arora-Sir">Mohit Arora</a> &nbsp;|&nbsp; Practice on <a href="https://takeuforward.org/pricing?affiliate=arorasir">TakeUForward (TUF+)</a> &nbsp;|&nbsp; ⭐ <a href="https://github.com/Arora-Sir/TUFHub">Star TUFHub on GitHub</a>
</p>
