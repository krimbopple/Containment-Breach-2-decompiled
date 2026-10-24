Function XDBXFBX620%()
    Local local0%
    Local local1%
    Local local2%
    Local local3%
    Local local4%
    Local local5%
    local0 = $07
    local1 = $E0
    For local2 = $01 To $FF Step $01
        local3 = (local2 And local0)
        If (local3 <> $00) Then
            If ((local3 And (local3 - $01)) = $00) Then
                local4 = (local2 And local1)
                local5 = $00
                Select local4
                    Case $00
                        local5 = $01
                    Case $20
                        local5 = $01
                    Case $60
                        local5 = $01
                    Case $E0
                        local5 = $01
                End Select
                If (local5 <> 0) Then
                    TX22BX46F8(local2)
                EndIf
            EndIf
        EndIf
    Next
    Return $00
End Function
