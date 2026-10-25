Function GUESSEDgetbrush_2%()
    Local local0.T24B4ZF6F6
    Local local1.itemtemplates
    Local local2%
    Local local3%
    Local local4%
    Local local5%
    Local local6%
    Local local7%
    Local local8%
    local0 = DZ64X028\Field18
    If (((local0 <> Null) And DZ64X028\Field18\Field3\Field28) <> 0) Then
        If (DZ64X028\Field61 <> Null) Then
            local1 = DZ64X028\Field61\Field6
        ElseIf (DZ64X028\Field0 <> Null) Then
            If (DZ64X028\Field0\Field53 <> $00) Then
                GUESSEDgetmap($00, DZ64X028\Field0\Field53)
                local2 = eax_003F
                If (local2 <> $00) Then
                    
                    local1 = eax_0046
                EndIf
            EndIf
        EndIf
        If (local1 = Null) Then
            Return $00
        EndIf
        If (DZ64X028\Field63 <> local1) Then
            local3 = $00
            local4 = getentitybrush(local1\Field21)
            getbrushcolor(local4, local5, local6, local7)
            local8 = getbrushtexture(local4, $00)
            If (local8 <> $00) Then
                If (texturename(local8) <> "") Then
                    local3 = local8
                Else
                    freetexture(local8)
                EndIf
            EndIf
            freebrush(local4)
            If ((((local3 = $00) And (entityclass(local1\Field21) = "Mesh")) And (countsurfaces(local1\Field21) > $00)) <> 0) Then
                local4 = getsurfacebrush(getsurface(local1\Field21, $01))
                local8 = getbrushtexture(local4, $00)
                If (local8 <> $00) Then
                    If (texturename(local8) <> "") Then
                        local3 = local8
                    Else
                        freetexture(local8)
                    EndIf
                EndIf
                freebrush(local4)
            EndIf
            If (local3 <> $00) Then
                If (local0\Field3\Field40 > $00) Then
                    If (GUESSEDgetbrush(local0\Field9, local3, (local0\Field3\Field40 + $01), $14000, $FF, $FF, $FF) = $00) Then
                        GUESSEDgetbrush(local0\Field9, local3, (local0\Field3\Field40 - $01), $14000, local5, local6, local7)
                    EndIf
                ElseIf (local0\Field3\Field28 <> 0) Then
                    GUESSEDgetbrush(local0\Field9, local3, $02, $14000, local5, local6, local7)
                EndIf
            EndIf
            If (local0\Field3\Field11 > $00) Then
                GUESSEDgetbrush(local0\Field9, GUESSEDcreatetex_3(), local0\Field3\Field11, $14008, $FF, $FF, $FF)
            EndIf
            DZ64X028\Field63 = local1
        EndIf
    EndIf
    Return $00
End Function
