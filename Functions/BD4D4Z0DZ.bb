Function BD4D4Z0DZ%()
    Local local0#
    Local local1#
    Local local2#
    Local local3.X22ZD22448
    Local local4#
    local0 = (Float XZB6BXFF02\Field9)
    local1 = 0.0
    local2 = opt\Field66
    local3 = (Last X22ZD22448)
    While (local3 <> Null)
        local4 = (((Float T20Z2BXFZ6F(local3\Field2, (Int (((local2 - 70.0) * menuscale) + (4.0 * menuscale))), opt\Field46, (Int (25.0 * menuscale)), local3\Field0)) * 25.0) * menuscale)
        local0 = (local0 - local4)
        local3\Field3 = (XZB6BXFF02\Field14 + local0)
        local1 = (local1 + local4)
        local3 = (Before local3)
    Wend
    Return (Int local1)
    Return $00
End Function
