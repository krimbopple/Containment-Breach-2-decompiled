Function T26BDZFX8B%(arg0.rooms)
    Local local0%
    Local local1%
    Local local2.rooms
    Local local3%
    local0 = $00
    For local1 = $00 To $03 Step $01
        local2 = arg0\Field29[local1]
        If (local2 <> Null) Then
            X8ZBZ6X4BB[local0] = local2
            local0 = (local0 + $01)
            If (local0 = $10) Then
                Return local0
            EndIf
            For local3 = $00 To $03 Step $01
                local2 = arg0\Field29[local1]\Field29[local3]
                If (local2 <> Null) Then
                    X8ZBZ6X4BB[local0] = local2
                    local0 = (local0 + $01)
                    If (local0 = $10) Then
                        Return local0
                    EndIf
                EndIf
            Next
        EndIf
    Next
    Return local0
    Return $00
End Function
