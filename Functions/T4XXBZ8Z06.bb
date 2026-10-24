Function T4XXBZ8Z06%()
    Local local0%
    Local local1%
    Local local2#
    Local local3#
    If (TX4F400F244 <> Null) Then
        color($FF, $FF, $FF, $FF)
        local0 = (Int (300.0 * menuscale))
        local1 = (Int (20.0 * menuscale))
        local2 = (Float (TDD0Z6BXB6\Field6 - (local0 Sar $01)))
        local3 = ((Float TDD0Z6BXB6\Field9) + (80.0 * menuscale))
        renderbar(blinkmeterimg, (Int local2), (Int local3), local0, local1, TX4F400F244\Field14, 100.0, $96, $96, $96, $00)
    EndIf
    Return $00
End Function
