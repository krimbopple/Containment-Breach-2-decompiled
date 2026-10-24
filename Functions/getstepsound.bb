Function getstepsound%(arg0%)
    Local local0%
    Local local1%
    Local local2%
    Local local3$
    Local local4.materials
    local0 = linepick(entityx(arg0, $00, 1.0), entityy(arg0, $00, 1.0), entityz(arg0, $00, 1.0), 0.0, -5.0, 0.0, 0.0)
    If (local0 <> $00) Then
        If (getentitytype(local0) <> $01) Then
            Return $00
        EndIf
        local1 = getsurfacebrush(getsurface(local0, countsurfaces(local0)))
        If (local1 <> $00) Then
            local2 = getbrushtexture(local1, $00)
            If (local2 <> $00) Then
                local3 = strippath(texturename(local2))
                freetexture(local2)
                local2 = $00
                If (local3 <> "") Then
                    For local4 = Each materials
                        If (local4\Field7 = local3) Then
                            freebrush(local1)
                            local1 = $00
                            Return local4\Field8
                            Exit
                        EndIf
                    Next
                EndIf
            EndIf
            freebrush(local1)
            local1 = $00
        EndIf
    EndIf
    Return $00
    Return $00
End Function
