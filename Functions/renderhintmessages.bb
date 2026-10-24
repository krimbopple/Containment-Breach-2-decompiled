Function renderhintmessages%()
    Local local0%
    Local local1%
    Local local2%
    Local local3%
    If (T208Z6XX884 <> 0) Then
        Return $00
    EndIf
    local0 = (Int ((Float stringwidth(msg\Field1)) + (20.0 * menuscale)))
    local1 = (Int (30.0 * menuscale))
    local2 = (TDD0Z6BXB6\Field6 - (local0 Sar $01))
    local3 = (Int (msg\Field4 + (Float (- local1))))
    If (msg\Field1 <> "") Then
        renderframe(local2, local3, local0, local1, $00, $00, $00, $01)
        color($FF, $FF, $FF, $FF)
        setfontex(XD00026ZX2\Field0[$00])
        textex(TDD0Z6BXB6\Field6, ((local1 Sar $01) + local3), msg\Field1, $01, $01)
    EndIf
    Return $00
End Function
