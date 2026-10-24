Function XX8XZZFFF$(arg0$)
    Local local0$
    Local local1%
    Local local2%
    Local local3%
    Local local4%
    Local local5$
    Local local6.TX4BBZDZ08F
    Local local7%
    Delete Each TX4BBZDZ08F
    XXBF488ZXZ((- X2BD664FD2))
    
    local0 = eax_000B
    local1 = CDFBZ2D22()
    For local2 = $00 To (local1 - $01) Step $01
        local6 = (New TX4BBZDZ08F)
        local6\Field0 = YB862X4F8(local2, local3, local4)
        local6\Field3 = local3
        local6\Field2 = local4
        local7 = local6\Field3
        If (local7 = $03) Then
            local6\Field4 = (generateseednumber(local6\Field0) + local6\Field2)
        EndIf
    Next
    T6Z20B84Z6 = (First TX4BBZDZ08F)
    Return local0
    Return ""
End Function
