// This is just a basic "it compiled and ran" test.
// What we're really guarding against is failure to
// compile the bindings as a result of buggy codegen.

import uniffi.regression_test_missing_newline.*;

// does not throw
emptyFunc()

assert(getDict() == emptyMap<String, String>())
