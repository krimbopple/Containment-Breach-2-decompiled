Function preventroomoverlap%(arg0.rooms)
    Local local0.rooms
    Local local1.rooms
    Local local2%
    Local local3%
    Local local4%
    Local local5%
    Local local6%
    Local local7%
    Local local8%
    Local local9%
    If (arg0\Field22\Field13 <> 0) Then
        Return $00
    EndIf
    local2 = $00
    local3 = arg0\Field22\Field21
    If (((local3 = $28) Lor (local3 = $4A)) <> 0) Then
        Return $00
    EndIf
    For local0 = Each rooms
        If (((local0 <> arg0) And (local0\Field22\Field13 = $00)) <> 0) Then
            If (checkroomoverlap(arg0, local0) <> 0) Then
                local2 = $01
                Exit
            EndIf
        EndIf
    Next
    If (local2 = $00) Then
        Return $00
    EndIf
    local2 = $00
    local4 = (Int (arg0\Field40 / 8.0))
    local5 = (Int (arg0\Field37 / 8.0))
    If (arg0\Field22\Field3 = $01) Then
        arg0\Field21 = (Int ((Float arg0\Field21) + 180.0))
        rotateentity(arg0\Field15, 0.0, (Float arg0\Field21), 0.0, $00)
        calculateroomextents(arg0)
        For local0 = Each rooms
            If (((local0 <> arg0) And (local0\Field22\Field13 = $00)) <> 0) Then
                If (checkroomoverlap(arg0, local0) <> 0) Then
                    local2 = $01
                    arg0\Field21 = (Int ((Float arg0\Field21) - 180.0))
                    rotateentity(arg0\Field15, 0.0, (Float arg0\Field21), 0.0, $00)
                    calculateroomextents(arg0)
                    Exit
                EndIf
            EndIf
        Next
    Else
        local2 = $01
    EndIf
    If (local2 = $00) Then
        Return $01
    EndIf
    local2 = $01
    For local0 = Each rooms
        If (((local0 <> arg0) And (local0\Field22\Field13 = $00)) <> 0) Then
            local3 = local0\Field22\Field21
            If ((((arg0\Field22\Field3 = local0\Field22\Field3) And (arg0\Field0 = local0\Field0)) And (((local3 <> $28) And (local3 <> $4A)) And (local3 <> $03))) <> 0) Then
                local4 = (Int (arg0\Field40 / 8.0))
                local5 = (Int (arg0\Field37 / 8.0))
                local8 = arg0\Field21
                local6 = (Int (local0\Field40 / 8.0))
                local7 = (Int (local0\Field37 / 8.0))
                local9 = local0\Field21
                local2 = $00
                arg0\Field40 = ((Float local6) * 8.0)
                arg0\Field37 = ((Float local7) * 8.0)
                arg0\Field21 = local9
                positionentity(arg0\Field15, arg0\Field40, arg0\Field3, arg0\Field37, $00)
                rotateentity(arg0\Field15, 0.0, (Float arg0\Field21), 0.0, $00)
                calculateroomextents(arg0)
                local0\Field40 = ((Float local4) * 8.0)
                local0\Field37 = ((Float local5) * 8.0)
                local0\Field21 = local8
                positionentity(local0\Field15, local0\Field40, local0\Field3, local0\Field37, $00)
                rotateentity(local0\Field15, 0.0, (Float local0\Field21), 0.0, $00)
                calculateroomextents(local0)
                For local1 = Each rooms
                    If (local1\Field22\Field13 = $00) Then
                        If (local1 <> arg0) Then
                            If (checkroomoverlap(arg0, local1) <> 0) Then
                                local2 = $01
                                Exit
                            EndIf
                        EndIf
                        If (local1 <> local0) Then
                            If (checkroomoverlap(local0, local1) <> 0) Then
                                local2 = $01
                                Exit
                            EndIf
                        EndIf
                    EndIf
                Next
                If (local2 <> 0) Then
                    arg0\Field40 = ((Float local4) * 8.0)
                    arg0\Field37 = ((Float local5) * 8.0)
                    arg0\Field21 = local8
                    positionentity(arg0\Field15, arg0\Field40, arg0\Field3, arg0\Field37, $00)
                    rotateentity(arg0\Field15, 0.0, (Float arg0\Field21), 0.0, $00)
                    calculateroomextents(arg0)
                    local0\Field40 = ((Float local6) * 8.0)
                    local0\Field37 = ((Float local7) * 8.0)
                    local0\Field21 = local9
                    positionentity(local0\Field15, local0\Field40, local0\Field3, local0\Field37, $00)
                    rotateentity(local0\Field15, 0.0, (Float local0\Field21), 0.0, $00)
                    calculateroomextents(local0)
                    local2 = $00
                EndIf
            EndIf
        EndIf
    Next
    If (local2 = $00) Then
        Return $01
    EndIf
    Return $01
    Return $00
End Function
