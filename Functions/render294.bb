Function render294%()
    Local local0#
    Local local1#
    Local local2%
    Local local3%
    Local local4%
    showpointer()
    local0 = (Float (TDD0Z6BXB6\Field6 - (imagewidth(X2Z260BF0Z\Field4[$05]) Sar $01)))
    local1 = (Float (TDD0Z6BXB6\Field9 - (imageheight(X2Z260BF0Z\Field4[$05]) Sar $01)))
    drawblock((Int local0), (Int local1), $00, $00)
    rendercursor()
    local4 = (playerroom\Field8 = $00)
    setfontex(XD00026ZX2\Field0[$02])
    textex((Int ((905.0 * menuscale) + local0)), (Int ((185.0 * menuscale) + local1)), right(i_294\Field1, $0D), $01, $01)
    If (local4 <> 0) Then
        If ((TDD0Z6BXB6\Field12 Lor (i_294\Field4 = $00)) <> 0) Then
            hidepointer()
        EndIf
    ElseIf (ChannelPlaying(playerroom\Field8) = $00) Then
        If (i_294\Field1 <> getlocalstring("misc", "ofr")) Then
            hidepointer()
        EndIf
    EndIf
    Return $00
End Function
