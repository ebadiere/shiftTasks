Commits were made with each to allow a diff listing of each step in the "fix" process.  The output from each run is below:

First run:

en-ebadiere-001907:task3 badiere.eric$ npm run tests

> @ tests /Users/badiere.eric/projects/shiftTasks/task3
> karma start

Hash: f4683f5fa2953dc3a97c
Version: webpack 1.15.0
Time: 168ms
webpack: Compiled successfully.
webpack: Compiling...
Hash: 3808060c1cdb0f2757df
Version: webpack 1.15.0
Time: 1751ms
          Asset     Size  Chunks             Chunk Names
test-context.js  4.54 kB       0  [emitted]  test-context.js
chunk    {0} test-context.js (test-context.js) 2.58 kB [rendered]
    [0] ./test-context.js 139 bytes {0} [built]
    [1] ./source -spec\.js$ 181 bytes {0} [built]
    [2] ./source/mymath-spec.js 749 bytes {0} [optional] [built]
    [3] ./source/mymath.js 1.51 kB {0} [built]
webpack: Compiled successfully.
09 06 2017 19:18:04.783:WARN [karma]: No captured browser, open http://localhost:9876/
09 06 2017 19:18:04.800:INFO [karma]: Karma v0.13.22 server started at http://localhost:9876/
09 06 2017 19:18:04.832:INFO [launcher]: Starting browser PhantomJS
09 06 2017 19:18:06.983:INFO [PhantomJS 2.1.1 (Mac OS X 0.0.0)]: Connected on socket cmkJINah9h7C_JeyAAAA with id 4549243
PhantomJS 2.1.1 (Mac OS X 0.0.0) LOG: ['./mymath-spec.js']

PhantomJS 2.1.1 (Mac OS X 0.0.0) MyMath should add two numbers FAILED
	TypeError: undefined is not a constructor (evaluating 'new _mymath.MyMath()') in /Users/badiere.eric/projects/shiftTasks/task3/test-context.js (line 86)
	/Users/badiere.eric/projects/shiftTasks/task3/test-context.js:86:37
PhantomJS 2.1.1 (Mac OS X 0.0.0) MyMath should subtract two numbers FAILED
	TypeError: undefined is not a constructor (evaluating 'new _mymath.MyMath()') in /Users/badiere.eric/projects/shiftTasks/task3/test-context.js (line 95)
	/Users/badiere.eric/projects/shiftTasks/task3/test-context.js:95:37
PhantomJS 2.1.1 (Mac OS X 0.0.0) MyMath should multiply two numbers FAILED
	TypeError: undefined is not a constructor (evaluating 'new _mymath.MyMath()') in /Users/badiere.eric/projects/shiftTasks/task3/test-context.js (line 104)
	/Users/badiere.eric/projects/shiftTasks/task3/test-context.js:104:37
PhantomJS 2.1.1 (Mac OS X 0.0.0) MyMath should divide two numbers FAILED
	TypeError: undefined is not a constructor (evaluating 'new _mymath.MyMath()') in /Users/badiere.eric/projects/shiftTasks/task3/test-context.js (line 113)
	/Users/badiere.eric/projects/shiftTasks/task3/test-context.js:113:37
PhantomJS 2.1.1 (Mac OS X 0.0.0): Executed 4 of 4 (4 FAILED) ERROR (0.009 secs / 0.005 secs)

Second run.  Fixed math operations but is still missing the "export".  Not sure what it does besides make this work sometimes.
ebpack: Compiling...
Hash: 283b76ff96c607ca3aa8
Version: webpack 1.15.0
Time: 832ms
          Asset     Size  Chunks             Chunk Names
test-context.js  4.54 kB       0  [emitted]  test-context.js
chunk    {0} test-context.js (test-context.js) 2.58 kB [rendered]
    [0] ./test-context.js 139 bytes {0} [built]
    [1] ./source -spec\.js$ 181 bytes {0} [built]
    [2] ./source/mymath-spec.js 749 bytes {0} [optional] [built]
    [3] ./source/mymath.js 1.51 kB {0} [built]
webpack: Compiled successfully.
09 06 2017 19:21:51.741:WARN [karma]: No captured browser, open http://localhost:9876/
09 06 2017 19:21:51.752:INFO [karma]: Karma v0.13.22 server started at http://localhost:9876/
09 06 2017 19:21:51.768:INFO [launcher]: Starting browser PhantomJS
09 06 2017 19:21:52.870:INFO [PhantomJS 2.1.1 (Mac OS X 0.0.0)]: Connected on socket i--VVUOtj425OJE7AAAA with id 95383268
PhantomJS 2.1.1 (Mac OS X 0.0.0) LOG: ['./mymath-spec.js']

PhantomJS 2.1.1 (Mac OS X 0.0.0) MyMath should add two numbers FAILED
	TypeError: undefined is not a constructor (evaluating 'new _mymath.MyMath()') in /Users/badiere.eric/projects/shiftTasks/task3/test-context.js (line 86)
	/Users/badiere.eric/projects/shiftTasks/task3/test-context.js:86:37
PhantomJS 2.1.1 (Mac OS X 0.0.0) MyMath should subtract two numbers FAILED
	TypeError: undefined is not a constructor (evaluating 'new _mymath.MyMath()') in /Users/badiere.eric/projects/shiftTasks/task3/test-context.js (line 95)
	/Users/badiere.eric/projects/shiftTasks/task3/test-context.js:95:37
PhantomJS 2.1.1 (Mac OS X 0.0.0) MyMath should multiply two numbers FAILED
	TypeError: undefined is not a constructor (evaluating 'new _mymath.MyMath()') in /Users/badiere.eric/projects/shiftTasks/task3/test-context.js (line 104)
	/Users/badiere.eric/projects/shiftTasks/task3/test-context.js:104:37
PhantomJS 2.1.1 (Mac OS X 0.0.0) MyMath should divide two numbers FAILED
	TypeError: undefined is not a constructor (evaluating 'new _mymath.MyMath()') in /Users/badiere.eric/projects/shiftTasks/task3/test-context.js (line 113)
	/Users/badiere.eric/projects/shiftTasks/task3/test-context.js:113:37
PhantomJS 2.1.1 (Mac OS X 0.0.0): Executed 4 of 4 (4 FAILED) ERROR (0.004 secs / 0.002 secs)

Third run:

chunk    {0} test-context.js (test-context.js) 2.58 kB [rendered]
    [0] ./test-context.js 139 bytes {0}
    [1] ./source -spec\.js$ 181 bytes {0} [built]
    [2] ./source/mymath-spec.js 749 bytes {0} [optional]
    [3] ./source/mymath.js 1.51 kB {0} [built]
webpack: Compiled successfully.
PhantomJS 2.1.1 (Mac OS X 0.0.0) LOG: ['./mymath-spec.js']

PhantomJS 2.1.1 (Mac OS X 0.0.0) MyMath should add two numbers FAILED
	TypeError: undefined is not a constructor (evaluating 'new _mymath.MyMath()') in /Users/badiere.eric/projects/shiftTasks/task3/test-context.js (line 86)
	/Users/badiere.eric/projects/shiftTasks/task3/test-context.js:86:37
PhantomJS 2.1.1 (Mac OS X 0.0.0) MyMath should subtract two numbers FAILED
	TypeError: undefined is not a constructor (evaluating 'new _mymath.MyMath()') in /Users/badiere.eric/projects/shiftTasks/task3/test-context.js (line 95)
	/Users/badiere.eric/projects/shiftTasks/task3/test-context.js:95:37
PhantomJS 2.1.1 (Mac OS X 0.0.0) MyMath should multiply two numbers FAILED
	TypeError: undefined is not a constructor (evaluating 'new _mymath.MyMath()') in /Users/badiere.eric/projects/shiftTasks/task3/test-context.js (line 104)
	/Users/badiere.eric/projects/shiftTasks/task3/test-context.js:104:37
PhantomJS 2.1.1 (Mac OS X 0.0.0) MyMath should divide two numbers FAILED
	TypeError: undefined is not a constructor (evaluating 'new _mymath.MyMath()') in /Users/badiere.eric/projects/shiftTasks/task3/test-context.js (line 113)
	/Users/badiere.eric/projects/shiftTasks/task3/test-context.js:113:37
PhantomJS 2.1.1 (Mac OS X 0.0.0): Executed 4 of 4 (4 FAILED) ERROR (0.004 secs / 0.004 secs)

Fourth Run:

Version: webpack 1.15.0
Time: 91ms
webpack: Compiled successfully.
webpack: Compiling...
Hash: b8ce833d3fb2c82796f4
Version: webpack 1.15.0
Time: 958ms
          Asset     Size  Chunks             Chunk Names
test-context.js  4.64 kB       0  [emitted]  test-context.js
chunk    {0} test-context.js (test-context.js) 2.67 kB [rendered]
    [0] ./test-context.js 139 bytes {0} [built]
    [1] ./source -spec\.js$ 181 bytes {0} [built]
    [2] ./source/mymath-spec.js 749 bytes {0} [optional] [built]
    [3] ./source/mymath.js 1.6 kB {0} [built]
webpack: Compiled successfully.
09 06 2017 19:26:34.307:WARN [karma]: No captured browser, open http://localhost:9876/
09 06 2017 19:26:34.316:INFO [karma]: Karma v0.13.22 server started at http://localhost:9876/
09 06 2017 19:26:34.334:INFO [launcher]: Starting browser PhantomJS
09 06 2017 19:26:35.426:INFO [PhantomJS 2.1.1 (Mac OS X 0.0.0)]: Connected on socket CRzbCChxpQLE9pdbAAAA with id 48029103
PhantomJS 2.1.1 (Mac OS X 0.0.0) LOG: ['./mymath-spec.js']

PhantomJS 2.1.1 (Mac OS X 0.0.0): Executed 4 of 4 SUCCESS (0.003 secs / 0.004 secs)