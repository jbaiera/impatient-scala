package chapters.ch07

/**
  * Chapter 07, Example 01:
  * Write an example program to demonstrate that
  *
  *   package com.horstmann.impatient
  *
  * is not the same as
  *
  *   package com
  *   package horstmann
  *   package impatient
  */

package com.horstmann.impatient {
  object DirectPath
}

package com {
  object ComObject
  package horstmann {
    object HorstmannObject
    package impatient {
      object ImpatientObject
    }
  }
}

package com.horstmann.impatient {
  object Ex01 extends App {
    // Can't reference the following without imports or extra pathing:
    // ComObject
    // HorstmannObject
    ImpatientObject
    DirectPath
  }
}


