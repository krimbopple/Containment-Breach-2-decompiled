Function resetinput%(arg0#)
    Local local0%
    stopmousemovement()
    flushkeys()
    flushmouse()
    TDD0Z6BXB6\Field7 = $00
    TDD0Z6BXB6\Field12 = $00
    TDD0Z6BXB6\Field2 = $00
    TDD0Z6BXB6\Field1 = $00
    TDD0Z6BXB6\Field8 = $00
    TDD0Z6BXB6\Field10 = $00
    TDD0Z6BXB6\Field3 = $00
    TDD0Z6BXB6\Field0 = $00
    TDD0Z6BXB6\Field5 = $00
    For local0 = $01 To $08 Step $01
        mousehit(local0)
    Next
    grabbedentity = $00
    input_resettime = arg0
    Return $00
End Function
