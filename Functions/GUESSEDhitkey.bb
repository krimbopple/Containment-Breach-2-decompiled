Function GUESSEDhitkey%()
    Local local0%
    Local local1.XZ0FBD6000
    If (opt\Field74 = $00) Then
        Return $00
    EndIf
    local0 = $00
    If (FX848D8X0 < millisecs()) Then
        For local1 = Each XZ0FBD6000
            If (local1\Field6 <> 0) Then
                TX6X48DXXDX = $01
                local0 = $01
                If ((local1\Field18 And TDD0Z6BXB6\Field7) <> 0) Then
                    GUESSEDsendobjectfield(local1)
                    resetinput(5.0)
                    Exit
                EndIf
            EndIf
        Next
    EndIf
    If ((local0 And keyhit($01)) <> 0) Then
        GUESSEDsendobjectfield(Null)
        FX848D8X0 = (millisecs() + $3E8)
    EndIf
    Return $00
End Function
