Function XXF4D24BF%(arg0$, arg1%)
    Local local0%
    Local local1%
    Local local2%
    Local local3%
    Local local4%
    local1 = $00
    local2 = $270F
    For local0 = $00 To len(arg0) Step $01
        local3 = (stringwidth(left(arg0, local0)) + arg1)
        local4 = (((mousex() - local3) Xor (- (mousex() < local3))) - (- (mousex() < local3)))
        If (local4 < local2) Then
            local2 = local4
            local1 = local0
        EndIf
    Next
    Return local1
    Return $00
End Function
