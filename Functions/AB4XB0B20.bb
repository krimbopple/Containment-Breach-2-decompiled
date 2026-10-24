Function AB4XB0B20$(arg0$, arg1%)
    Local local0$
    Local local1%
    Local local2%
    Local local3$
    Local local4%
    Local local5%
    local2 = $00
    local3 = ""
    For local4 = $01 To len(arg0) Step $01
        local0 = mid(arg0, local4, $01)
        If (local0 = chr($22)) Then
            For local5 = (local4 + $01) To len(arg0) Step $01
                local0 = mid(arg0, local5, $01)
                local4 = (local4 + $01)
                If (local0 = chr($22)) Then
                    Exit
                EndIf
                local3 = (local3 + local0)
            Next
            If (local2 = arg1) Then
                Return local3
            EndIf
            local3 = ""
            local2 = (local2 + $01)
        EndIf
    Next
    Return ""
    Return ""
End Function
