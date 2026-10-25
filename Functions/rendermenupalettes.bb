Function rendermenupalettes%()
    Local local0.menupalette
    Local local1%
    Local local2%
    Local local3%
    local1 = (Int (5.0 * menuscale))
    For local0 = Each menupalette
        drawimage(local0\Field3, local0\Field0, $00, $00)
        If (mouseon(local0\Field0, local0\Field2, local0\Field1, local0\Field4) <> 0) Then
            If ((TDD0Z6BXB6\Field1 And (onsliderid = $00)) <> 0) Then
                local2 = backbuffer()
                lockbuffer(local2)
                local3 = readpixelfast((Int mouseposx), (Int mouseposy), local2)
                unlockbuffer(local2)
                opt\Field8 = readpixelcolor(local3, $10)
                opt\Field52 = readpixelcolor(local3, $08)
                opt\Field1 = readpixelcolor(local3, $00)
            EndIf
            color($00, $00, $00, $FF)
            GUESSEDdrawoval((Int mouseposx), (Int mouseposy), local1, local1, $00)
        EndIf
    Next
    Return $00
End Function
