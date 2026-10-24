Function X0B08FD2BX%()
    Local local0%
    Local local1%
    If (((X4BX024DX0() = $00) Lor (T8X2046020\Field22 = $00)) <> 0) Then
        Return $00
    EndIf
    local0 = (Int min(4.0, (Float (maxitemamount - $01))))
    If (((((((menuopen Lor invopen) Lor consoleopen) Lor (otheropen <> Null)) Lor TX6X48DXXDX) Lor (selecteditem <> Null)) Lor (Int XZ0260X8X2\Field48)) <> 0) Then
        For local1 = $02 To (local0 + $02) Step $01
            keyhit(local1)
        Next
        Return $00
    EndIf
    For local1 = $02 To (local0 + $02) Step $01
        If ((keyhit(local1) And (TX60DB8XBBZ((local1 - $02)) <> Null)) <> 0) Then
            selecteditem = TX60DB8XBBZ((local1 - $02))
            XB80D84602(selecteditem)
            If (selecteditem\Field6\Field5 <> $42) Then
                playsound_strict(snd_i\Field46[selecteditem\Field6\Field5], $00, $00)
            EndIf
            Exit
        EndIf
    Next
    Return $00
End Function
