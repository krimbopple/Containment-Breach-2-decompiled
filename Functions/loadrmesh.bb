Function loadrmesh%(arg0$, arg1.roomtemplates, arg2%)
    Local local0%
    Local local1%
    Local local2%
    Local local3%
    Local local4%
    Local local5#
    Local local6#
    Local local7#
    Local local8%
    Local local9%
    Local local10%
    Local local11%
    Local local12$
    Local local13%
    Local local14%
    Local local16%
    Local local17$
    Local local18%
    Local local19%
    Local local20%
    Local local21%
    Local local22%[2]
    Local local23%
    Local local24%
    Local local25%
    Local local26#
    Local local27#
    Local local28%
    Local local29%
    Local local30#
    Local local31#
    Local local32#
    Local local33%
    Local local34%
    Local local35.tempscreens
    Local local36.tempwaypoints
    Local local37.templights
    Local local38.tempsoundemitters
    Local local39.tempprops
    Local local40.TFFD0Z88DZ
    Local local41.Y0D6F4BXB0
    Local local42%
    Local local43$
    Local local44#
    Local local45%
    Local local46%
    Local local47%
    Local local48$
    Local local49$
    Local local50%
    Local local52%
    Local local53%
    Local local54%
    Local local55%
    Local local56%
    Local local57%
    catcherrors((("LoadRMesh(" + arg0) + ")"))
    local0 = readfile_strict(arg0)
    If (local0 = $00) Then
        runtimeerrorex(format(getlocalstring("runerr", "file"), arg0, "%s"))
    EndIf
    clscolor($00, $00, $00, $FF)
    local9 = $00
    local10 = $00
    local11 = $00
    local13 = createpivot($00)
    Select readstring(local0)
        Case "RoomMesh"
            local14 = $01
        Case "RoomMesh2"
            local14 = $02
        Case "RoomMesh2.1"
            local14 = $03
        Default
            runtimeerrorex(format(format(getlocalstring("runerr", "notrmesh"), arg0, "{0}"), (Str local16), "{1}"))
    End Select
    local17 = stripfilename(arg0)
    local18 = createmesh($00)
    local19 = createmesh($00)
    local25 = $00
    local28 = readint(local0)
    For local2 = $01 To local28 Step $01
        local20 = createmesh($00)
        local21 = createsurface(local20, $00)
        local23 = createbrush(255.0, 255.0, 255.0)
        local22[$00] = $00
        local22[$01] = $00
        local24 = $00
        local25 = $00
        For local3 = $00 To $01 Step $01
            local9 = readbyte(local0)
            If (local9 <> $00) Then
                local12 = readstring(local0)
                If (filetype((local17 + local12)) = $01) Then
                    If (local9 < $03) Then
                        local22[local3] = loadtexturecheckingifincache((local17 + local12), $01, $00, 1.0)
                    Else
                        local22[local3] = loadtexturecheckingifincache((local17 + local12), $03, $00, 1.0)
                    EndIf
                ElseIf (filetype(("GFX\Map\Textures\" + local12)) = $01) Then
                    If (local9 < $03) Then
                        local22[local3] = loadtexturecheckingifincache(("GFX\Map\Textures\" + local12), $01, $00, 1.0)
                    Else
                        local22[local3] = loadtexturecheckingifincache(("GFX\Map\Textures\" + local12), $03, $00, 1.0)
                    EndIf
                EndIf
                If (local22[local3] <> $00) Then
                    If (local9 = $01) Then
                        textureblend(local22[local3], $02)
                    EndIf
                    local24 = $02
                    If (local9 = $03) Then
                        local24 = $01
                        brushfx(local23, $20)
                    EndIf
                    texturecoords(local22[local3], ($01 - local3))
                EndIf
                local25 = ((lower(strippath(local12)) = "glass.png") Lor (lower(strippath(local12)) = "mat_glass.png"))
            EndIf
        Next
        If (local22[$01] <> $00) Then
            brushtexture(local23, local22[$01], $00, $00)
        Else
            brushtexture(local23, missingtexture, $00, $00)
        EndIf
        TZXZZ288XZ(local23, $FFFFFFFF, $00)
        If (local24 > $00) Then
            paintsurface(local21, local23)
        EndIf
        freebrush(local23)
        local23 = $00
        local29 = readint(local0)
        For local3 = $01 To local29 Step $01
            local5 = readfloat(local0)
            local6 = readfloat(local0)
            local7 = readfloat(local0)
            local8 = addvertex(local21, local5, local6, local7, 0.0, 0.0, 1.0)
            For local4 = $00 To $01 Step $01
                local26 = readfloat(local0)
                local27 = readfloat(local0)
                vertextexcoords(local21, local8, local26, local27, 0.0, local4)
            Next
            local9 = readbyte(local0)
            local10 = readbyte(local0)
            local11 = readbyte(local0)
            vertexcolor(local21, local8, (Float local9), (Float local10), (Float local11), 1.0)
            If (local14 >= $02) Then
                local30 = readfloat(local0)
                local31 = readfloat(local0)
                local32 = readfloat(local0)
                vertexnormal(local21, local8, local30, local32, local31)
            EndIf
        Next
        local29 = readint(local0)
        For local3 = $01 To local29 Step $01
            local9 = readint(local0)
            local10 = readint(local0)
            local11 = readint(local0)
            addtriangle(local21, local9, local10, local11)
        Next
        If (local24 = $01) Then
            updatenormals(local20, $01)
            addmesh(local20, local19)
            entityalpha(local20, 0.0)
        EndIf
        If (((local24 <> $01) Lor local25) <> 0) Then
            addmesh(local20, local18)
            entityparent(local20, local13, $01)
            entityalpha(local20, 0.0)
            entitytype(local20, arg2, $00)
            entitypickmode(local20, $02, $01)
            If (arg2 <> 0) Then
                local33 = copymesh(local20, $00)
                flipmesh(local33)
                addmesh(local33, local20)
                freeentity(local33)
                local33 = $00
            EndIf
        EndIf
    Next
    local34 = createmesh($00)
    local28 = readint(local0)
    For local2 = $01 To local28 Step $01
        local21 = createsurface(local34, $00)
        local29 = readint(local0)
        For local3 = $01 To local29 Step $01
            local5 = readfloat(local0)
            local6 = readfloat(local0)
            local7 = readfloat(local0)
            local8 = addvertex(local21, local5, local6, local7, 0.0, 0.0, 1.0)
        Next
        local29 = readint(local0)
        For local3 = $01 To local29 Step $01
            local9 = readint(local0)
            local10 = readint(local0)
            local11 = readint(local0)
            addtriangle(local21, local9, local10, local11)
            addtriangle(local21, local9, local11, local10)
        Next
    Next
    local28 = readint(local0)
    If (arg1 <> Null) Then
        For local2 = $01 To local28 Step $01
            local12 = readstring(local0)
            Select local12
                Case "door"
                    local40 = (New TFFD0Z88DZ)
                    local40\Field4 = arg1
                    local40\Field0 = (readfloat(local0) * (1.0 / 256.0))
                    local40\Field7 = (readfloat(local0) * (1.0 / 256.0))
                    local40\Field9 = (readfloat(local0) * (1.0 / 256.0))
                    local40\Field3 = readfloat(local0)
                    local40\Field1 = readfloat(local0)
                    local40\Field5 = readfloat(local0)
                    local40\Field10 = readbyte(local0)
                    local40\Field6 = readint(local0)
                    local40\Field8 = readint(local0)
                    local40\Field2 = readint(local0)
                Case "screen"
                    readfloat(local0)
                    readfloat(local0)
                    readfloat(local0)
                    local49 = readstring(local0)
                    runtimeerrorex(format(format(getlocalstring("runerr", "screen.support"), (Str arg1\Field21), "%s"), ("GFX\Map\Screens\" + local49), "%s"))
                Case "save_screen"
                    local35 = (New tempscreens)
                    local35\Field4 = arg1
                    local35\Field6 = (readfloat(local0) * (1.0 / 256.0))
                    local35\Field3 = (readfloat(local0) * (1.0 / 256.0))
                    local35\Field8 = (readfloat(local0) * (1.0 / 256.0))
                    readstring(local0)
                    local35\Field7 = readfloat(local0)
                    local35\Field1 = readfloat(local0)
                    local35\Field0 = readfloat(local0)
                    local35\Field9 = (readfloat(local0) * (1.0 / 256.0))
                    local35\Field2 = (readfloat(local0) * (1.0 / 256.0))
                    local35\Field5 = (readfloat(local0) * (1.0 / 256.0))
                    local35\Field10 = readstring(local0)
                Case "waypoint"
                    local36 = (New tempwaypoints)
                    local36\Field3 = arg1
                    local36\Field0 = (readfloat(local0) * (1.0 / 256.0))
                    local36\Field2 = (readfloat(local0) * (1.0 / 256.0))
                    local36\Field1 = (readfloat(local0) * (1.0 / 256.0))
                Case "light_fix"
                    local37 = (New templights)
                    local37\Field7 = arg1
                    local37\Field11 = (readfloat(local0) * (1.0 / 256.0))
                    local37\Field8 = (readfloat(local0) * (1.0 / 256.0))
                    local37\Field4 = (readfloat(local0) * (1.0 / 256.0))
                    local37\Field9 = $02
                    local43 = readstring(local0)
                    local44 = (readfloat(local0) * 0.8)
                    local37\Field1 = (readfloat(local0) / 2000.0)
                    local37\Field2 = (Int ((Float (Int piece(local43, $01, " "))) * local44))
                    local37\Field3 = (Int ((Float (Int piece(local43, $02, " "))) * local44))
                    local37\Field14 = (Int ((Float (Int piece(local43, $03, " "))) * local44))
                    local37\Field5 = $00
                    Delete local37
                Case "light"
                    local37 = (New templights)
                    local37\Field7 = arg1
                    local37\Field11 = (readfloat(local0) * (1.0 / 256.0))
                    local37\Field8 = (readfloat(local0) * (1.0 / 256.0))
                    local37\Field4 = (readfloat(local0) * (1.0 / 256.0))
                    local37\Field9 = $02
                    local37\Field1 = (readfloat(local0) / 2000.0)
                    local43 = readstring(local0)
                    local44 = (readfloat(local0) * 0.8)
                    local37\Field2 = (Int ((Float (Int piece(local43, $01, " "))) * local44))
                    local37\Field3 = (Int ((Float (Int piece(local43, $02, " "))) * local44))
                    local37\Field14 = (Int ((Float (Int piece(local43, $03, " "))) * local44))
                    If (local14 >= $02) Then
                        local37\Field5 = readbyte(local0)
                        local37\Field12 = readfloat(local0)
                        local37\Field0 = readbyte(local0)
                        local37\Field6 = readfloat(local0)
                        local37\Field17 = readfloat(local0)
                        local37\Field15 = readfloat(local0)
                        local37\Field10 = readfloat(local0)
                        For local52 = $01 To $1C Step $01
                            readint(local0)
                        Next
                    Else
                        local37\Field5 = $01
                    EndIf
                Case "spotlight"
                    local37 = (New templights)
                    local37\Field7 = arg1
                    local37\Field11 = (readfloat(local0) * (1.0 / 256.0))
                    local37\Field8 = (readfloat(local0) * (1.0 / 256.0))
                    local37\Field4 = (readfloat(local0) * (1.0 / 256.0))
                    local37\Field9 = $03
                    local37\Field1 = (readfloat(local0) / 2000.0)
                    local43 = readstring(local0)
                    local44 = (readfloat(local0) * 0.8)
                    local37\Field2 = (Int ((Float (Int piece(local43, $01, " "))) * local44))
                    local37\Field3 = (Int ((Float (Int piece(local43, $02, " "))) * local44))
                    local37\Field14 = (Int ((Float (Int piece(local43, $03, " "))) * local44))
                    local37\Field5 = readbyte(local0)
                    local37\Field12 = readfloat(local0)
                    local37\Field0 = readbyte(local0)
                    local37\Field15 = readfloat(local0)
                    local37\Field10 = readfloat(local0)
                    local37\Field16 = readfloat(local0)
                    local37\Field6 = readfloat(local0)
                    local37\Field17 = readfloat(local0)
                    For local52 = $01 To $1E Step $01
                        readint(local0)
                    Next
                Case "soundemitter"
                    local38 = (New tempsoundemitters)
                    local38\Field1 = arg1
                    local38\Field3 = (readfloat(local0) * (1.0 / 256.0))
                    local38\Field0 = (readfloat(local0) * (1.0 / 256.0))
                    local38\Field5 = (readfloat(local0) * (1.0 / 256.0))
                    local38\Field2 = readint(local0)
                    local38\Field4 = readfloat(local0)
                Case "model"
                    local49 = readstring(local0)
                    runtimeerrorex(format(format(getlocalstring("runerr", "model.support"), arg1\Field12, "{0}"), ("GFX\Map\Props\" + local49), "{1}"))
                Case "mesh"
                    local39 = (New tempprops)
                    local39\Field5 = arg1
                    local39\Field9 = (readfloat(local0) * (1.0 / 256.0))
                    local39\Field11 = (readfloat(local0) * (1.0 / 256.0))
                    local39\Field8 = (readfloat(local0) * (1.0 / 256.0))
                    local49 = readstring(local0)
                    If (fileextension(local49) = "b3d") Then
                        local49 = left(local49, (len(local49) - $04))
                    EndIf
                    local39\Field7 = (("GFX\Map\Props\" + local49) + ".b3d")
                    local39\Field4 = readfloat(local0)
                    local39\Field1 = readfloat(local0)
                    local39\Field2 = readfloat(local0)
                    local39\Field3 = readfloat(local0)
                    local39\Field14 = readfloat(local0)
                    local39\Field15 = readfloat(local0)
                    local39\Field10 = readbyte(local0)
                    local39\Field13 = readint(local0)
                    local39\Field16 = readstring(local0)
                    If (local14 >= $03) Then
                        local39\Field12 = readfloat(local0)
                        local39\Field0 = readfloat(local0)
                        local39\Field6 = readfloat(local0)
                    Else
                        local39\Field12 = 255.0
                        local39\Field0 = 255.0
                        local39\Field6 = 255.0
                    EndIf
                Case "reflectionprobe"
                    local41 = (New Y0D6F4BXB0)
                    local41\Field7 = arg1
                    local41\Field0 = $00
                    local41\Field6 = $100
                    local41\Field2 = 0.0
                    local41\Field13 = 0.0
                    local41\Field1 = 0.0
                    local41\Field17 = 1.1
                    local41\Field14 = 1.1
                    local41\Field22 = 1.1
                    local53 = createmesh($00)
                    local54 = createsurface(local53, $00)
                    local55 = readint(local0)
                    For local3 = $01 To local55 Step $01
                        local5 = readfloat(local0)
                        local6 = readfloat(local0)
                        local7 = readfloat(local0)
                        addvertex(local54, local5, local6, local7, 0.0, 0.0, 1.0)
                    Next
                    local56 = readint(local0)
                    For local3 = $01 To local56 Step $01
                        local9 = readint(local0)
                        local10 = readint(local0)
                        local11 = readint(local0)
                        addtriangle(local54, local9, local10, local11)
                        addtriangle(local54, local9, local11, local10)
                    Next
                    getmeshextents(local53, 100000000.0)
                    freeentity(local53)
                    local41\Field20 = mesh_midx
                    local41\Field3 = mesh_midy
                    local41\Field18 = mesh_midz
                    local41\Field15 = mesh_minx
                    local41\Field10 = mesh_miny
                    local41\Field21 = mesh_minz
                    local41\Field16 = mesh_maxx
                    local41\Field5 = mesh_maxy
                    local41\Field12 = mesh_maxz
                    local50 = $01
            End Select
        Next
    EndIf
    local9 = copymesh(local19, $00)
    flipmesh(local9)
    addmesh(local9, local19)
    freeentity(local9)
    local9 = $00
    If (local23 <> $00) Then
        freebrush(local23)
        local23 = $00
    EndIf
    If (local14 < $02) Then
        updatenormals(local18, $01)
    EndIf
    updatetb(local18)
    addmesh(local19, local18)
    freeentity(local19)
    local19 = $00
    entityfx(local18, $02)
    entityalpha(local34, 0.0)
    entitytype(local34, arg2, $00)
    entityalpha(local18, 1.0)
    local57 = createpivot($00)
    createpivot(local57)
    entityparent(local18, local57, $01)
    entityparent(local34, local57, $01)
    createpivot(local57)
    createpivot(local57)
    entityparent(local13, local57, $01)
    BZ80B2864(local18, $01)
    closefile(local0)
    XB04X8D680()
    If (((arg1 <> Null) And (local50 = $00)) <> 0) Then
        local41 = (New Y0D6F4BXB0)
        local41\Field7 = arg1
        local41\Field0 = $00
        local41\Field6 = $100
        local41\Field2 = 0.0
        local41\Field13 = 0.0
        local41\Field1 = 0.0
        local41\Field17 = 1.1
        local41\Field14 = 1.1
        local41\Field22 = 1.1
        getmeshextents(local18, 100000000.0)
        local41\Field20 = mesh_midx
        local41\Field3 = mesh_midy
        local41\Field18 = mesh_midz
        local41\Field15 = mesh_minx
        local41\Field10 = mesh_miny
        local41\Field21 = mesh_minz
        local41\Field16 = mesh_maxx
        local41\Field5 = mesh_maxy
        local41\Field12 = mesh_maxz
    EndIf
    catcherrors((("Uncaught: LoadRMesh(" + arg0) + ")"))
    Return local57
    Return $00
End Function
