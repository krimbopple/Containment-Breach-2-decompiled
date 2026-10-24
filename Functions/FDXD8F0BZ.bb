Function FDXD8F0BZ%()
    Local local0%
    Local local1.TXD6DBZ6XZ4
    Local local2.XZD48028ZB
    Local local3.TXX0ZX4BDF2
    Local local4%
    Local local5.T24B4ZF6F6
    Local local6.itemtemplates
    Local local7.roomtemplates
    Local local8.rooms
    local0 = $00
    For local1 = Each TXD6DBZ6XZ4
        local0 = (local0 + generateseednumber(lower(local1\Field1)))
    Next
    For local2 = Each XZD48028ZB
        local0 = (local0 + generateseednumber(lower(local2\Field1)))
    Next
    For local3 = Each TXX0ZX4BDF2
        For local4 = $00 To $07 Step $01
            local0 = (local0 + generateseednumber(lower(local3\Field11[local4])))
        Next
    Next
    For local5 = Each T24B4ZF6F6
        local0 = (local0 + generateseednumber(lower(local5\Field8)))
    Next
    For local6 = Each itemtemplates
        If (local6\Field19 <> "ERROR") Then
            local0 = (local0 + generateseednumber(local6\Field19))
        EndIf
    Next
    For local7 = Each roomtemplates
        local0 = (local0 + generateseednumber(lower(local7\Field12)))
        If (local7\Field0 <> $00) Then
            For local4 = $01 To countsurfaces(local7\Field0) Step $01
                local0 = ((counttriangles(getsurface(local7\Field0, local4)) + local0) + countvertices(getsurface(local7\Field0, local4)))
            Next
        EndIf
    Next
    For local8 = Each rooms
        local0 = (local0 + generateseednumber(lower(local8\Field22\Field12)))
    Next
    Return local0
    Return $00
End Function
